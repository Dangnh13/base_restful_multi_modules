package ko.alliex.energy.jwt.exception;

import com.nimbusds.jose.proc.BadJWSException;
import ko.alliex.energy.framework.exception.model.BasicErrorResponse;
import ko.alliex.energy.framework.exception.model.ErrorCode;
import ko.alliex.energy.framework.exception.model.ErrorResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.oauth2.server.resource.InvalidBearerTokenException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Arrays;

/**
 * Handle authentication exceptions across the whole application
 */
@Data
@AllArgsConstructor
@Slf4j
@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class AuthenticationExceptionControllerAdvice {

    @ExceptionHandler(value = {InvalidBearerTokenException.class,
            BadJWSException.class,
            InvalidTokenException.class,
            TokenException.class,
            AuthenticationException.class}
    )
    public ResponseEntity<?> authenticationFailed(Exception e) {
        log.info("Login failed: {}", e.getMessage());
        BasicErrorResponse errorResponse = ErrorResponse.of(e.getMessage(), Arrays.asList(ErrorCode.EINVAL_TOKEN.getErrorCode()));
        return new ResponseEntity<>(errorResponse, HttpStatus.UNAUTHORIZED);
    }

}

