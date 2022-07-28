package ko.alliex.energy.framework.exception.handler.impl;

import ko.alliex.energy.framework.component.MessageService;
import ko.alliex.energy.framework.exception.handler.IExceptionHandler;
import ko.alliex.energy.framework.exception.model.BasicErrorResponse;
import ko.alliex.energy.framework.exception.model.ErrorResponse;
import ko.alliex.energy.framework.exception.type.NoDataFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * Handling No data found exception
 */
@Slf4j
public class NoDataFoundExceptionHandler implements IExceptionHandler<NoDataFoundException> {

    @Autowired
    private MessageService messageService;

    @Override
    public BasicErrorResponse handle(NoDataFoundException exception, HttpServletRequest req) {
        log.error(exception.getMessage(), exception);
        return ErrorResponse.of("No data found!", exception.getErrorCodes());
    }
}
