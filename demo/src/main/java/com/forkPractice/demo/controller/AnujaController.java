package com.forkPractice.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/anuja")
public class AnujaController {
    @GetMapping("/say-Hello")
    public String gretting(){
        return "Hello Anuja !!";
    }
}
