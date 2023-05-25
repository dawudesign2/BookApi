package fr.dawudesign.bookapi.controllers.exceptions;

import org.springframework.http.HttpStatus;

public class WebErrorMapper {

    public static WebError map(Exception e) {
        WebError result;
        if (e instanceof ParametrizeMessageException) {
            result = new WebError(
                    HttpStatus.BAD_REQUEST.value(),
                    HttpStatus.BAD_REQUEST,
                    null,
                    ((ParametrizeMessageException) e).getCodeMessage(),
                    ((ParametrizeMessageException) e).getDefaultMessage(),
                    ((ParametrizeMessageException) e).getParams()

            );
        } else {
            result = new WebError(
                    HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    null,
                    e.getMessage(),
                    e.getMessage(),
                    null
            );
        }
        return result;
    }
}
