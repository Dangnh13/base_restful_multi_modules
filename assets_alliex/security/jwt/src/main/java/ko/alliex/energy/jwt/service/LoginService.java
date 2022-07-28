package ko.alliex.energy.jwt.service;

import ko.alliex.energy.framework.security.model.LoginInfo;
import ko.alliex.energy.jwt.dto.dxo.LoginDxo;
import ko.alliex.energy.jwt.dto.response.JwtResponse;
import ko.alliex.energy.jwt.util.JwtTokenUtil;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@Data
@Slf4j
public class LoginService {

    private final int NUMBER_CHARS_RANDOM_STR_TOKEN_APPEND = 6;

    private final AuthenticationManager authenticationManager;

    private final JwtTokenUtil jwtTokenUtil;

    public JwtResponse doLogin(LoginDxo loginDxo) {

        Authentication authenticate = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(loginDxo.getEmail(), loginDxo.getPassword()));

        String accessToken = jwtTokenUtil.generateToken((LoginInfo) authenticate.getPrincipal());

        return new JwtResponse(accessToken);
    }


}
