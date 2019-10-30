package com.example.apigateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class Hearth {
            @RequestMapping("/health")
            public String checkHeath(){
                return "200";
            }
}
