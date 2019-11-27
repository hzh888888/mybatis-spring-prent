package com.controller.jump;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/jump")
public class JumpController {

    @RequestMapping("/demo1")
    public String demo1(){
        return "forward:demo2";
    }

    @RequestMapping("/demo2")
    public String demo2(){
        return "index";
    }

    @RequestMapping("/demo3")
    public String demo3(){
        return "forward:/WEB-INF/jsp/index.jsp";
    }

    @RequestMapping("/demo4")
    public String demo4(){
        return "redirect:dis";
    }

    @RequestMapping("/demo5")
    public RedirectView demo5(){
        RedirectView redirectView=new RedirectView("dis");
        return redirectView;
    }

    @RequestMapping("/demo6")
    public String demo6(){
        return "redirect:/index2.jsp";
    }

    @RequestMapping("/demo7")
    public RedirectView demo7(){
        RedirectView redirectView=new RedirectView("/index2.jsp");
        return redirectView;
    }
    @RequestMapping("/dis")
    public String dis(){
        return "index";
    }
}
