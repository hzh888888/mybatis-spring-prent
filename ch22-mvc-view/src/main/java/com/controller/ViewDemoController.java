package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/index")
public class ViewDemoController {


    @RequestMapping("/demo1")
    public String demo1(){
        return "index";
    }

    @RequestMapping("/demo2")
    public String demo2(HttpServletRequest request){
        request.setAttribute("f","黄志欢");
        return "index";

    }

    @RequestMapping("/demo3")
    public ModelAndView demo3(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/demo4")
    public String demo4(HttpServletRequest request){
        request.setAttribute("f","黄志换4");
        return "redirect:dis";
    }


    @RequestMapping("/demo5")
    public RedirectView demo5(){
        RedirectView redirectView=new RedirectView("dis");
        return redirectView;
    }

    @RequestMapping("/dis")
    public String demo44(){
        return "index";
    }
}
