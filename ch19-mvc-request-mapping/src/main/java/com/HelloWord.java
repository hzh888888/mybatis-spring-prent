package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/dept")
public class HelloWord {

    @RequestMapping("/a")
    public String index2(){
        return "index2";
    }


//    @RequestMapping(value = "/index",method = RequestMethod.GET)
//    public String index(){
//        return "index";
//    }
//
//    @RequestMapping(value = "/index" ,method = RequestMethod.POST)
//    public String index3(){
//        return "index3";
//    }

    @GetMapping("/get")
    public String get(){
        return "index";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "index3";
    }
}
