package com.lzo.user.client;

import com.lzo.user.client.fallback.AuthClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "auth-service", fallback = AuthClientFallback.class)
public interface AuthClient {

    @GetMapping
    String getAuthKey();
}
