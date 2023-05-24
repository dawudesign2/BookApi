package fr.dawudesign.bookapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "<h1>Welcome to the Book API </h1>" +
                "<a href='/api/books'>See our books </a>";
    }
}
