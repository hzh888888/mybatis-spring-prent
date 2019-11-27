package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dept")
public class HelloWord4 {


    @GetMapping("/get")
    public String index3(){
        return "index";
    }

    @PostMapping("/post")
    public String index4(){
        return "index3";
    }
}
