package ko.alliex.energy.jwt.filter;

import ko.alliex.energy.framework.constant.CommonConstant;
import ko.alliex.energy.framework.security.model.LoginInfo;
import ko.alliex.energy.jwt.util.JwtTokenUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static ko.alliex.energy.framework.constant.CommonConstant.TOKEN.TOKEN_PREFIX_BEARER;

public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final UserDetailsService clientDetailsService;

    private final JwtTokenUtil jwtTokenUtil;

    public JwtAuthenticationFilter(UserDetailsService clientDetailsService, JwtTokenUtil jwtTokenUtil) {
        this.clientDetailsService = clientDetailsService;
        this.jwtTokenUtil = jwtTokenUtil;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws ServletException, IOException {

        final String requestTokenHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
        final String requestTokenParam = request.getParameter(CommonConstant.TOKEN.ACCESS_TOKEN);

        // JWT Token is in the form "Bearer token". Remove Bearer word and get
        // only the Token
        if ((StringUtils.isNotBlank(requestTokenHeader) && isBearerToken(requestTokenHeader))
                || StringUtils.isNotBlank(requestTokenParam)) {
            String jwtToken = getAccessToken(requestTokenHeader, requestTokenParam);
            String clientId = jwtTokenUtil.getEmailFromToken(jwtToken);
            // Once we get the token validate it.
            if (StringUtils.isNotBlank(clientId)
                    && SecurityContextHolder.getContext().getAuthentication() == null) {

                LoginInfo clientLoginInfo = (LoginInfo) this.clientDetailsService.loadUserByUsername(clientId);
                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
                        clientLoginInfo, null, clientLoginInfo.getAuthorities());
                usernamePasswordAuthenticationToken
                        .setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                // After setting the Authentication in the context, we specify
                // that the current user is authenticated
                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
            }
        }

        chain.doFilter(request, response);
    }

    private boolean isBearerToken(final String tokenHeader) {
        return StringUtils.isNotBlank(tokenHeader) && tokenHeader.startsWith(TOKEN_PREFIX_BEARER);
    }

    private String getAccessToken(String bearerToken, String requestParamToken) {
        String jwtToken = requestParamToken;
        if (StringUtils.isNotBlank(bearerToken) && isBearerToken(bearerToken)) {
            jwtToken = bearerToken.substring(7);
        }
        return jwtToken;
    }
}
