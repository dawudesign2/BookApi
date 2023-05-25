package fr.dawudesign.bookapi.controllers.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@Slf4j
public class HandlerException extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ParametrizeMessageException.class)
    public ResponseEntity<Object> handleParametrizeMessageException(ParametrizeMessageException e, WebRequest request) {
        log.error(e.getMessage(), e);
        return handleExceptionInternal(e, e.toWebError(),new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
}
