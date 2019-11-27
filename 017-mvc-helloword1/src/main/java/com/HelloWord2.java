package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/dept")
public class HelloWord2 {

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("msg","mvc");
        return modelAndView;
    }
}
