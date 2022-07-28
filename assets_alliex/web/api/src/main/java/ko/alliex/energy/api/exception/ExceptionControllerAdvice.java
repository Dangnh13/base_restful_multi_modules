package ko.alliex.energy.api.exception;

import ko.alliex.energy.framework.exception.DefaultRestExceptionControllerAdvice;
import ko.alliex.energy.framework.exception.handler.IExceptionHandler;
import ko.alliex.energy.framework.exception.type.NoDataFoundException;
import ko.alliex.energy.framework.exception.type.ServiceException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionControllerAdvice extends DefaultRestExceptionControllerAdvice {

    public ExceptionControllerAdvice(IExceptionHandler<ServiceException> serviceExceptionHandler,
                                     IExceptionHandler<BindException> bindExceptionHandler,
                                     IExceptionHandler<MethodArgumentNotValidException> methodArgumentNotValidExceptionIExceptionHandler,
                                     IExceptionHandler<Exception> unknownExceptionHandler,
                                     IExceptionHandler<NoDataFoundException> noDataFoundExceptionIExceptionHandler) {
        super(serviceExceptionHandler,
                bindExceptionHandler,
                methodArgumentNotValidExceptionIExceptionHandler,
                unknownExceptionHandler,
                noDataFoundExceptionIExceptionHandler);
    }
}
