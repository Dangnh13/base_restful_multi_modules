package ko.alliex.energy.framework.security;

import com.google.gson.Gson;
import ko.alliex.energy.framework.component.MessageService;
import ko.alliex.energy.framework.exception.model.BasicErrorResponse;
import ko.alliex.energy.framework.exception.model.ErrorCode;
import ko.alliex.energy.framework.exception.model.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@Slf4j
public class PreAuthenticatedEntryPoint implements AuthenticationEntryPoint {

    private static transient String UNAUTHORIZED_MESSAGE = "error.message.common.authentication.unauthorized";

    @Autowired
    private MessageService messageService;

    // Override
    // ------------------------------------------------------------------------

    @Override
    public void commence(HttpServletRequest request,
                         HttpServletResponse response,
                         AuthenticationException ex) throws IOException {
        log.info(messageService.getMessage(UNAUTHORIZED_MESSAGE, request));
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        BasicErrorResponse errorResponse = ErrorResponse.of(
                messageService.getMessage(UNAUTHORIZED_MESSAGE, request),
                Arrays.asList(ErrorCode.EUNAUTHORIZED.getErrorCode()));

        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.getWriter().println(new Gson().toJson(errorResponse));
        response.getWriter().flush();
    }

}
