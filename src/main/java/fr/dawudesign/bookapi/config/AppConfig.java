package fr.dawudesign.bookapi.config;

import fr.dawudesign.bookapi.controllers.exceptions.WebErrorMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public WebErrorMapper webErrorMapper() {
        return new WebErrorMapper();
    }
}
