package com.controller;

import com.entity.EmployeeEntity;
import com.github.pagehelper.PageInfo;
import com.serivce.EmployeeSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;
@Controller
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeSerivce employeeSerivcer;

    @RequestMapping("/List")
    public String list(@RequestParam(value = "pageNum",required = false,defaultValue = "1")
                               int pageNum , @RequestParam(value = "pageSize",required = false,defaultValue = "2") int pageSize, Model model){
        List<EmployeeEntity> employeeEntities=employeeSerivcer.getAll1(pageNum,pageSize);
        PageInfo<EmployeeEntity> pageInfo=new PageInfo<>(employeeEntities);
        model.addAttribute("pageInfo",pageInfo);
        return "employee/list";
    }

    @RequestMapping("/add")
    public String add(){
        return "employee/add";
    }

    @PostMapping("/insert")
    public String insert( EmployeeEntity employeeEntitye, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "employee/add";
        }
        employeeSerivcer.insert1(employeeEntitye);
        return "redirect:List";
    }
}
