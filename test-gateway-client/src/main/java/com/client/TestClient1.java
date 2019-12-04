package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestClient1 {
    public static void main(String[] args) {
        SpringApplication.run(TestClient1.class,args);
    }

    @RequestMapping("serverhealth")
    public String serverhealth(){
        System.out.println("======gateway client check health is ok =======");
        return "ok";
    }
}
