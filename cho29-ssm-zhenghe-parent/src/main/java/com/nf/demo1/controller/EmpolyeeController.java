package com.nf.demo1.controller;

import com.github.pagehelper.PageInfo;
import com.nf.demo1.entity.EmployeeEntity;
import com.nf.demo1.serivcer.EmployeeSerivcer;
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
public class EmpolyeeController {
    @Autowired
    private EmployeeSerivcer employeeSerivcer;

    @RequestMapping("/List")
    public String list(@RequestParam(value = "pageNum",required = false,defaultValue = "1")
    int pageNum , @RequestParam(value = "pageSize",required = false,defaultValue = "2") int pageSize, Model model){
        List<EmployeeEntity> employeeEntities=employeeSerivcer.getAll(pageNum,pageSize);
        PageInfo<EmployeeEntity> pageInfo=new PageInfo<>(employeeEntities);
        model.addAttribute("pageInfo",pageInfo);
        return "employee/list";
    }

    @RequestMapping("/add")
    public String add(){
        return "employee/add";
    }

    @PostMapping("/insert")
    public String insert(@Valid EmployeeEntity employeeEntitye, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "employee/add";
        }
        employeeSerivcer.insert(employeeEntitye);
        return "redirect:List";
    }
}
