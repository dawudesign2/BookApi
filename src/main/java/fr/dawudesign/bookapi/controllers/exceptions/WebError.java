package fr.dawudesign.bookapi.controllers.exceptions;

import org.springframework.http.HttpStatus;

import java.util.Date;

public record WebError(
        int httpStatusCode,
        HttpStatus httpStatus,
        Date timestamp,
        String codeMessage,
        String defaultMessage,
        Object... params
) { }
