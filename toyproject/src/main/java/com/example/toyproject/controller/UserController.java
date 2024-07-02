package com.example.toyproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/")
    public String home() {
        return "Hello, home";
    }

    @GetMapping("/secured")
    public String secured() {
        return "Hello, secured";
    }
}
