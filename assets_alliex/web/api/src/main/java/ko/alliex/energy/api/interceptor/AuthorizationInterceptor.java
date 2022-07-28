package ko.alliex.energy.api.interceptor;

import ko.alliex.energy.framework.component.MessageService;
import ko.alliex.energy.framework.exception.type.ServiceException;
import ko.alliex.energy.framework.security.model.FuncAuthority;
import ko.alliex.energy.framework.security.model.LoginInfo;
import ko.alliex.energy.framework.security.model.UserGrantedAuthority;
import ko.alliex.energy.framework.security.annotation.Secured;
import lombok.Data;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Data
public class AuthorizationInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    @Lazy
    MessageService messageService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String servletPath = request.getServletPath();
        String httpMethod = request.getMethod();
        if (StringUtils.isNotBlank(servletPath)) {
            LoginInfo loginInfo = LoginInfo.fromContext();
            if (loginInfo != null) {
                Secured secured = AnnotationUtils.findAnnotation(((HandlerMethod) handler).getMethod(), Secured.class);
                if (secured != null && !secured.value()) {
                    return true;
                }

                UserGrantedAuthority userGrantedAuthority = loginInfo.getUserGrantedAuthority();
                if (userGrantedAuthority != null) {
                    List<FuncAuthority> funcAuthorities = userGrantedAuthority.getFuncAuthoritySet();
                    if (CollectionUtils.isNotEmpty(funcAuthorities)) {
                        boolean allowAccessPath = funcAuthorities.stream()
                                .map(FuncAuthority::getFuncItems)
                                .collect(Collectors.toCollection(LinkedList::new))
                                .stream()
                                .filter(CollectionUtils::isNotEmpty)
                                .flatMap(List::stream)
                                .anyMatch(e -> new AntPathMatcher().match(e.getApiUrl(), servletPath)
                                        && e.getApiMethod().equals(httpMethod));
                        if (allowAccessPath) {
                            return true;
                        }
                    }
                }
            }
        }
        throw new ServiceException(HttpStatus.FORBIDDEN, messageService.getMessage("error.message.common.authentication.unauthorized"));
    }
}
