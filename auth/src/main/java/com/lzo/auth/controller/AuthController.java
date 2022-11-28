package com.lzo.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/auth")
public class AuthController {

    @GetMapping
    public String getAuthKey() {
        return "testSuccessful";
    }
}
