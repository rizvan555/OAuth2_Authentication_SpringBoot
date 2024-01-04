package com.MyTerminApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "Welcome to MyTerminApp";
    }

    @GetMapping("/secured")
    public String secured(){
        return "Hello,Secured";
    }
}
