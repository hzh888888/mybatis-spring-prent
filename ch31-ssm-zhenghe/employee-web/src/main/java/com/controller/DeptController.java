package com.controller;

import com.serivce.DeptSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptSerivce deptSerivcer;

    @RequestMapping("/delete")
    public String index(int deptid){
        deptSerivcer.del(deptid);
        return "redirect:/emp/List";
    }

}
