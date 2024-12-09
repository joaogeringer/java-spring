package com.teste.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello-World")
public class helloWorldController {
    // GET /hello-world
    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }
}
