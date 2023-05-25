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
) {
    public static WebError of (ParametrizeMessageException pme) {
        String defaultMessage = String.format(pme.getDefaultMessage(), pme.getParams());
        return new WebError(
                pme.getHttpStatus().value(),
                pme.getHttpStatus(),
                new Date(),
                pme.getCodeMessage(),
                defaultMessage,
                pme.getParams()
        );
    }
}
