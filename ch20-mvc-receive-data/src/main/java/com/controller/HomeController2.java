package com.controller;


import com.entity.UserInfo;
import com.formatter.EmpFormatter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
@RequestMapping("/formatter")
public class HomeController2 {

//    @InitBinder
//    public void xxx(WebDataBinder dataBinder){
//        dataBinder.addCustomFormatter(new EmpFormatter());
//        dataBinder.addCustomFormatter(new DateFormatter());
//    }

    @GetMapping("/date")
    public String receiveDate(@DateTimeFormat(pattern = "yyyy-MM-dd") Date date){
        System.out.println("date = " + date);
        return "index";
    }

    //支持2019/09/09
    @GetMapping("/date2")
    public String receiveDate2(Date date){
        System.out.println("date2= " + date);
        return "index";
    }

    @GetMapping("/userInfo")
    public  String receiveUserInfo(@RequestParam("xxx")UserInfo userInfo){
        System.out.println(userInfo);
        return "index";
    }
}
