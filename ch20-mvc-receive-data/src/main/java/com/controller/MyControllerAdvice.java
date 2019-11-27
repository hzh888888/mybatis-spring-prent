package com.controller;

import com.formatter.EmpFormatter;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice
public class MyControllerAdvice {


    @InitBinder
    public void xxx(WebDataBinder dataBinder){
        dataBinder.addCustomFormatter(new EmpFormatter());
        dataBinder.addCustomFormatter(new DateFormatter());
//        DateFormatter dateFormatter=new DateFormatter();
//        dateFormatter.setPattern("yyy-MM-dd");
//        dataBinder.addCustomFormatter(dateFormatter);
    }
}
