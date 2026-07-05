package com.novapay.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String home() {
        return "NovaPay Digital Bank is Running";
    }

    @GetMapping("/health")
    public String health() {
        return "Application Healthy";
    }
}