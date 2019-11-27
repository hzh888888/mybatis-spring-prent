package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_order.xml");
        EmployeeSerivceImpl service = context.getBean("employeeserivce", EmployeeSerivceImpl.class);
        int result=  service.add(5,6);
        System.out.println("result = " + result);

    }
}
