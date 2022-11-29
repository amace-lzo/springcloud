package com.lzo.usermanagement.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("auth-service")
public interface AuthService {

    @GetMapping
    String getAuthKey();
}
