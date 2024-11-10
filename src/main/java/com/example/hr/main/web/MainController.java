package com.example.hr.main.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Home Page";
    }

    @GetMapping("/api/hello")
    public String hello() {
        return "Welcome to the Flutter & Spring Boot";
    }
}
