package com.example.photos_back.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("")
    @ResponseBody
    public ResponseEntity<?> MyHome(){
        System.out.println("method : get comment : weclome to home");
        return ResponseEntity.ok()
                .body(
                        "정범준바보"
                );
    }
}
