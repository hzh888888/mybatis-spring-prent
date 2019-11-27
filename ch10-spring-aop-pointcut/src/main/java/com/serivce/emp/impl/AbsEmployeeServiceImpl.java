package com.serivce.emp.impl;

import com.serivce.MyAnno;
import com.serivce.emp.EmployeeService;

@MyAnno
public abstract class AbsEmployeeServiceImpl implements EmployeeService {

    public abstract void update();

    public void insert(){
        System.out.println("insert in AbsEmployeeServiceImpl");
    }
}
