package com.example.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {
    @RequestMapping("jenkins")
    public String hello() {
        return "Hello Jenkins!";
    }
}
