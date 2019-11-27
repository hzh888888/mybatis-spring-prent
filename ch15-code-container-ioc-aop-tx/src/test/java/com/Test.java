package com;

import com.multi.ServiceConfig;
import com.service.EmployeeServiceDao;
import com.service.HelloConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {


    @org.junit.Test
    public void testCodeHelloWorld(){
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloConfig.class);
        EmployeeServiceDao employeeService = context.getBean(EmployeeServiceDao.class);
        employeeService.del();
        System.out.println(employeeService);

    }






}
