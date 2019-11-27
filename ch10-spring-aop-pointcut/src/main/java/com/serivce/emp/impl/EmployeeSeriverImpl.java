package com.serivce.emp.impl;

import com.serivce.MyAnno;
import com.serivce.emp.EmployeeService;

public class EmployeeSeriverImpl extends AbsEmployeeServiceImpl {
    @Override
    public void getAll() {
        System.out.println("getAll in employeeServiceImpl");
    }

    @Override
    public void getById() {
        System.out.println("getById in employeeServiceImpl");
    }

    @Override
    public void deleteById() {
        System.out.println("deleteById in employeeServiceImpl");
    }

    public void xxx(){
        System.out.println("xxxx");
    }

    @MyAnno
    @Override
    public void update() {
        System.out.println("update-----------");
    }
}
