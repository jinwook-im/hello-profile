package com.gmarket.pipelinebluegreen.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Value("${spring.profiles.value}")
    private String profile;

    @GetMapping("/")
    public String hello() {
        return "Hi, Here is " + profile;
    }
    @GetMapping("/ping")
    public ResponseEntity<String> ping() {
        return new ResponseEntity<>(profile, HttpStatus.OK);
    }
}
