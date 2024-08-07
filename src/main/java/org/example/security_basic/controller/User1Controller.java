package org.example.security_basic.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.security_basic.VO.User1VO;
import org.example.security_basic.service.User1Service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
@Slf4j
public class User1Controller {
    private User1Service service;

    @GetMapping("/user1/login")
    public String login(){
        return "/user1/login";
    }

    @PostMapping("/user1/login")
    public String login(String uid, String pass, HttpSession session){
        User1VO user = service.selectUser1(uid, pass);

        if(user != null){
            // 회원이 맞을 경우
            session.setAttribute("sessUser", user);
            return "redirect:/user1/loginSuccess";
        }else{
            // 회원이 아닐 경우
            return "redirect:/user1/login?success=100";
        }
    }

    @GetMapping("/user1/loginSuccess")
    public String loginSuccess(){
        return "/user1/loginSuccess";
    }

    @GetMapping("/user1/logout")
    public String logout(){
        return "redirect:/user1/login?success=200";
    }
}
