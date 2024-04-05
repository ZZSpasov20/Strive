package org.project.Strive.bll.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!asdfasdfasdf";
    }

    @GetMapping("/home")
    public String hello() {
        return "This is home    ";
    }
    @GetMapping("/asd")
    public String hello2() {
        return "This is home    ";
    }


}