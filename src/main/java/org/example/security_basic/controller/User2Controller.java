package org.example.security_basic.controller;

import lombok.RequiredArgsConstructor;
import org.example.security_basic.service.User2Service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class User2Controller {

    @GetMapping("/user2/login")
    public String login(){
        return "/user2/logout";
    }

    @GetMapping("/user2/loginSuccess")
    public String loginSuccess(){
        return "/user2/loginSuccess";
    }
}
