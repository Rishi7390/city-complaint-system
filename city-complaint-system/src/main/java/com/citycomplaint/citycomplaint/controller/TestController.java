package com.citycomplaint.citycomplaint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String home() {
        return "City Complaint System is running!";
    }

    @GetMapping("/api/test")
    public String test() {
        return "API is working successfully!";
    }
}