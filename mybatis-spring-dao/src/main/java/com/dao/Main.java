package com.dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext  conect=new ClassPathXmlApplicationContext("spring.xml");
//        EmployeeDao employeeDao= (EmployeeDao) conect.getBean("frist");
        EmployeeDao employeeDao=conect.getBean("frist",com.dao.EmployeeDao.class);
        System.out.println(employeeDao);
        conect.close();
    }
}
