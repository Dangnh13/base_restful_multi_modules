package ko.alliex.energy.jwt.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.security.authentication.event.AuthenticationFailureCredentialsExpiredEvent;
import org.springframework.security.authentication.event.AuthenticationFailureDisabledEvent;
import org.springframework.security.authentication.event.AuthenticationFailureExpiredEvent;
import org.springframework.security.authentication.event.AuthenticationFailureLockedEvent;
import org.springframework.security.authentication.event.AuthenticationFailureProviderNotFoundEvent;
import org.springframework.security.authentication.event.AuthenticationFailureServiceExceptionEvent;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Component;

/**
 * Listener authentication events
 */
@Component
@Slf4j
public class AuthenticationEvents {

    @Async
    @EventListener
    public void onSuccess(AuthenticationSuccessEvent success) {
        // TODO
        log.info("Verify Jwt token SUCCESS");
    }


    /**
     * @param failures usernameNotFoundException, invalidBearerTokenException, badCredentialsException
     */
    @Async
    @EventListener
    public void invalidBearerTokenException(AuthenticationFailureBadCredentialsEvent failures) throws InterruptedException {
        log.info("Verify Jwt token failed: invalidBearerTokenException");
        // TODO
    }

    @Async
    @EventListener
    public void credentialsExpiredException(AuthenticationFailureCredentialsExpiredEvent failures) {
        log.info("Verify Jwt token failed: CredentialsExpiredException");
        // TODO
    }

    @Async
    @EventListener
    public void authenticationServiceException(AuthenticationFailureServiceExceptionEvent failures) {
        log.info("Verify Jwt token failed: authenticationServiceException");
        // TODO
    }

    @Async
    @EventListener
    public void lockedException(AuthenticationFailureLockedEvent failures) {
        log.info("Verify Jwt token failed: lockedException");
        // TODO
    }

    @Async
    @EventListener
    public void disabledException(AuthenticationFailureDisabledEvent failures) {
        log.info("Verify Jwt token failed: disabledException");
        // TODO
    }

    @Async
    @EventListener
    public void providerNotFoundException(AuthenticationFailureProviderNotFoundEvent failures) {
        log.info("Verify Jwt token failed: providerNotFoundException");
        // TODO
    }

    @Async
    @EventListener
    public void accountExpiredException(AuthenticationFailureExpiredEvent failures) {
        log.info("Verify Jwt token failed: AccountExpiredException");
        // TODO
    }
}
