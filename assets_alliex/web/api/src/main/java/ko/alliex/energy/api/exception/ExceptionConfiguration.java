package ko.alliex.energy.api.exception;

import ko.alliex.energy.framework.exception.handler.impl.BindExceptionHandler;
import ko.alliex.energy.framework.exception.handler.IExceptionHandler;
import ko.alliex.energy.framework.exception.handler.impl.MethodArgumentNotValidExceptionHandler;
import ko.alliex.energy.framework.exception.handler.impl.NoDataFoundExceptionHandler;
import ko.alliex.energy.framework.exception.handler.impl.ServiceExceptionHandler;
import ko.alliex.energy.framework.exception.handler.impl.UnknownExceptionHandler;
import ko.alliex.energy.framework.exception.type.NoDataFoundException;
import ko.alliex.energy.framework.exception.type.ServiceException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*import org.springframework.security.authentication.AuthenticationEventPublisher;
import org.springframework.security.authentication.DefaultAuthenticationEventPublisher;*/
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;

@Configuration
public class ExceptionConfiguration {
    @Bean
    public IExceptionHandler<ServiceException> serviceExceptionHandler() {
        return new ServiceExceptionHandler();
    }

    @Bean
    public IExceptionHandler<BindException> bindExceptionHandler() {
        return new BindExceptionHandler();
    }

    @Bean
    public IExceptionHandler<MethodArgumentNotValidException> methodArgumentNotValidExceptionIExceptionHandler() {
        return new MethodArgumentNotValidExceptionHandler();
    }

    @Bean
    public IExceptionHandler<NoDataFoundException> noDataFoundExceptionIExceptionHandler() {
        return new NoDataFoundExceptionHandler();
    }

    @Bean
    public IExceptionHandler<Exception> unknownExceptionHandler() {
        return new UnknownExceptionHandler();
    }

/*    @Bean
    public AuthenticationEventPublisher authenticationEventPublisher
            (ApplicationEventPublisher applicationEventPublisher) {
        return new DefaultAuthenticationEventPublisher(applicationEventPublisher);
    }*/
}
