package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWord3 {

    @RequestMapping(value = "/index" ,method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/index" ,method = RequestMethod.POST)
    public String index3(){
        return "index3";
    }
}
