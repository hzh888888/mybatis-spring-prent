package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWord {

    @RequestMapping("*")
    public String index(){
        return "index2";
    }

    @RequestMapping(value = {"index","index2"})
    public ModelAndView index2(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("msg","mvc");
        return modelAndView;
    }
}
