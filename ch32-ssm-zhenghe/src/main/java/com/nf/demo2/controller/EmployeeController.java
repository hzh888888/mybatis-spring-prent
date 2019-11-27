package com.nf.demo2.controller;

import com.github.pagehelper.PageInfo;
import com.nf.demo2.entity.EmployeeEntity;
import com.nf.demo2.service.EemployeeService;
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
    private EemployeeService eemployeeService;


    @RequestMapping("/List")
    public String list(@RequestParam (value = "pageNum" ,required = false,defaultValue = "1") int pageNum , @RequestParam(value = "pageSize" ,required = false,defaultValue = "2")int pageSize, Model model){

        List<EmployeeEntity> employeeEntities=eemployeeService.getAll2(pageNum,pageSize);
        PageInfo<EmployeeEntity> pageInfo=new PageInfo<>(employeeEntities);
        model.addAttribute("emp",pageInfo);
        return "employee/list";
    }

    @RequestMapping("/add")
    public String add(){
        return "add";
    }

    @PostMapping("/insert")
    public String insert(@Valid EmployeeEntity employeeEntitye, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "employee/add";
        }
        eemployeeService.insert2(employeeEntitye);
        return "redirect:List";
    }
}
