package com.example.First_spring_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@Controller
@ResponseBody
@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
    @GetMapping
    public String helloWorld(){
        return "Hello World";

    }

}
