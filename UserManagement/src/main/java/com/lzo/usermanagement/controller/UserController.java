package com.lzo.usermanagement.controller;

import com.lzo.usermanagement.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("user")
public class UserController {

    @Autowired
    private AuthService authService;

    @GetMapping("testFeign")
    public void  testFeign(){
        String result = authService.getAuthKey();
        System.out.println(result);
    }

}
