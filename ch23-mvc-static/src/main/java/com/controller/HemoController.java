package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HemoController {

    @RequestMapping("/")
    public String demo1(){
        return "index";
    }

    @RequestMapping("/demo.css")
    public String demo2(){
        return "index";
    }
}
