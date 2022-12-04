package com.lzo.usermanagement.controller;

import com.lzo.usermanagement.client.AuthClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("user")
public class UserController {

    @Autowired
    private AuthClient authClient;

    @GetMapping("testFeign")
    public void  testFeign(){
        String result = authClient.getAuthKey();
        System.out.println(result);
    }

}
