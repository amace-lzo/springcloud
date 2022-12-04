package com.lzo.user.controller;

import com.lzo.user.client.AuthClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("user")
public class UserController {

    @Value("${foo}")
    String foo;

    @Autowired
    private AuthClient authClient;

    @GetMapping("testFeign")
    public String testFeign(){
        return authClient.getAuthKey();
    }

    @RequestMapping(value = "/testConfig")
    public String testConfig(){
        return foo;
    }

}
