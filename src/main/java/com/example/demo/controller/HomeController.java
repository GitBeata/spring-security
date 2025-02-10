package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class HomeController {

   @GetMapping
    public String  home (){
        return "home";
    }

    @GetMapping("/login")
    public String login(){
       return "login";
    }

    @GetMapping("/dashboard")
    public String dashboard(){
       return "dashboard";
    }

    @GetMapping("/admin")
    public String admin(){
       return "admin";
    }
}
