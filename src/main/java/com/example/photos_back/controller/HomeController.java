package com.example.photos_back.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("")
    public String MyHome(){
        System.out.println("method : get comment : weclome to home");
        return "/home";
    }
}
