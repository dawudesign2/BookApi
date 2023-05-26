package fr.dawudesign.bookapi.controllers.exceptions;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RequiredArgsConstructor
@Slf4j
public class HandlerException extends ResponseEntityExceptionHandler {
    private final WebErrorMapper webErrorMapper;

    @ExceptionHandler(ParametrizeMessageException.class)
    public ResponseEntity<Object> handleParametrizeMessageException(ParametrizeMessageException e, WebRequest request) {
        log.error(e.getMessage(), e);
        return handleExceptionInternal(e, webErrorMapper.map(e) ,new HttpHeaders(), e.getHttpStatus(), request);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleAllException(Exception e, WebRequest request) {
        log.error(e.getMessage(), e);
        return handleExceptionInternal(e, webErrorMapper.map(e) ,new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }
}
