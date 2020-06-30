package com.example.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {
    @RequestMapping("jenkins")
    public String hello() {
        return "Hello Jenkins!";
    }

    @RequestMapping("jenkins1")
    public String hello1() {
        return "Hello Jenkins!~111111成狗了 1112222~~111~";
    }
}
