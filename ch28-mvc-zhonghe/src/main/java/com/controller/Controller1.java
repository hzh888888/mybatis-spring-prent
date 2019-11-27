package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class Controller1 {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/login2")
    public String index2(){
        return "login";
    }


    @RequestMapping("/login")
    public String login(String name, String pwd , HttpSession session){
        if(name.equals("root")&&pwd.equals("1234")){
            session.setAttribute("name",name);
            return "forward:index";
        }
        return "forward:login2";
    }

}
