package com.nf.demo1.controller;

import com.nf.demo1.service.DeptService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dept")
public class DeptController {


    @Autowired
    private DeptService1 deptSerivcer;

    @RequestMapping("/delete")
    public String index(int deptid){
        deptSerivcer.deleteById(deptid);
        return "redirect:/emp/List";
    }

}
