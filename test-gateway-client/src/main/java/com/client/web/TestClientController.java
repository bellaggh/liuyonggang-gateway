package com.client.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClientController {

    @Value("${server.port}")
    private  String port;

    @RequestMapping("test01")
    public String test01(){
        System.out.println("==================="+port);
        return port;
    }
}
