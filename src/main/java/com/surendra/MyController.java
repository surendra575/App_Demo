package com.surendra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/msg")
    public String msg(){
        return "Welcome to K8s helm charts....!!!";
    }
}
