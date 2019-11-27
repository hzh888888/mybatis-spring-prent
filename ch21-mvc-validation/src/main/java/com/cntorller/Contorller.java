package com.cntorller;

import com.entity.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class Contorller {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/add")
    public ModelAndView add(@Valid UserInfo userInfo, BindingResult bindingResult){
        ModelAndView modelAndView=new ModelAndView();
        if(bindingResult.hasErrors()){
            List<FieldError> errors=bindingResult.getFieldErrors();
            for (FieldError error :errors){
                modelAndView.addObject(error.getField(),error.getDefaultMessage());
            }
            modelAndView.setViewName("index");
        }else {
            modelAndView.setViewName("ok");
        }

        System.out.println(userInfo);
        return modelAndView;
    }
}
