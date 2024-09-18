package com.example.photos_back.login.controller;

import com.example.photos_back.login.Service.LoginService;
import com.example.photos_back.login.common.EmailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    LoginService loginService;


    @GetMapping("")
    public ResponseEntity<?> MyHome(){
        System.out.println("method : get comment : weclome to home");
        return ResponseEntity.ok()
                .body(
                        ""
                );
    }

    /**
     * @param emailRequest : tㄴo = 보내는 사람, subject = 제목, setText = 내용
     */
    @PostMapping("/send-email")
    public ResponseEntity<?> SendEmail(
            @RequestBody EmailRequest emailRequest
            ){
        System.out.println("이메일 송부에 도착함 ");

        loginService.sendEmail(emailRequest.getTo(), emailRequest.getSubject(), emailRequest.getSetText());

        return ResponseEntity.ok()
                .body(
                        "이메일이 발송되었습니다."
                );
    }
}
