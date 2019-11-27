package com.controller.passdatatoview;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("load")
public class LoadViewWithDataController {

    @RequestMapping("/demo1")
    public String demo1(HttpServletRequest request){
        request.setAttribute("f","黄志换1");
        return "index";
    }

    @RequestMapping("/demo2")
    public ModelAndView demo2(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("f","黄志换2");
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/demo3")
    public String demo3(Model model){
        model.addAttribute("f","黄志换3");
        return "index";
    }

    @RequestMapping("/demo4")
    public  String demo4(ModelMap modelMap){
        modelMap.addAttribute("f","黄志换4");
        return "index";
    }

    @RequestMapping("/demo5")
    public String demo5(Map<String,Object> map){
        map.put("f","黄志换5");
        return "index";
    }
}
