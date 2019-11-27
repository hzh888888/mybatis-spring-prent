package controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
//@Component
public class HelloController {

    @RequestMapping("/index")
    public static String aaa(){

        System.out.println("hello------------");
        return "hello";
    }

    @RequestMapping("index2")
    public ModelAndView handle2(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("index2");
        modelAndView.addObject("msg","mvc");
        return modelAndView;
    }
}
