package com.nf.demo2.controller;

import com.nf.demo2.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/del")
    public String delete(int id){
        deptService.del(id);
        return "redirect:/emp/List";
    }
}
