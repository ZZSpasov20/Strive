package org.project.Strive.bll.controllers;

import org.project.Strive.bll.services.AuthService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    AuthService authService;

    Test(AuthService authService){
        this.authService = authService;
    }
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!asdfasdfasdf";
    }

    @GetMapping("/home")
    public String hello(Authentication authentication) {
        return "Hello " + authService.getClientByToken(authentication).getUsername();
    }
    @GetMapping("/asd")
    public String hello2() {
        return "This is home    ";
    }
}