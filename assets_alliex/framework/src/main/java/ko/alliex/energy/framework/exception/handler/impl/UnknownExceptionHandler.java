package ko.alliex.energy.framework.exception.handler.impl;

import ko.alliex.energy.framework.component.MessageService;
import ko.alliex.energy.framework.exception.handler.IExceptionHandler;
import ko.alliex.energy.framework.exception.model.BasicErrorResponse;
import ko.alliex.energy.framework.exception.model.ErrorCode;
import ko.alliex.energy.framework.exception.model.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * Handling service exception
 */
@Slf4j
public class UnknownExceptionHandler implements IExceptionHandler<Exception> {

    @Autowired
    private MessageService messageService;

    @Override
    public BasicErrorResponse handle(Exception exception, HttpServletRequest req) {
        log.error(exception.getMessage());
        return ErrorResponse.of(HttpStatus.INTERNAL_SERVER_ERROR,
                messageService.getMessage(INTERNAL_SERVER_MSG_KEY, req),
                Arrays.asList(ErrorCode.EUNKNOWN.getErrorCode()));
    }
}
