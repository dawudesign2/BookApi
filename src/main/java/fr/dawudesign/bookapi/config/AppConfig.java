package fr.dawudesign.bookapi.config;

import fr.dawudesign.bookapi.controllers.exceptions.WebError;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public WebError webErrorMapper() {
        return new WebError(
                0,
                null,
                null,
                null,
                null,
                null
        );
    }
}
