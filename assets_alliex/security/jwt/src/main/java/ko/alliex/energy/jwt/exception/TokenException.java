package ko.alliex.energy.jwt.exception;

import org.springframework.security.core.AuthenticationException;

public class TokenException extends AuthenticationException {
    TokenException(String message) {
        super(message);
    }

    TokenException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
