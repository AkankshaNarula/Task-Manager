package com.example.task_manager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Marks this class as a REST API
@RequestMapping("/api")  // All routes inside this class start with /api
public class HelloController {

    @GetMapping("/hello")  // Handles GET requests to /api/hello
    public String sayHello() {
        return "Hello, Spring Boot!";
    }
}
