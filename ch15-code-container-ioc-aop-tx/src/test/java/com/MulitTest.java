package com;

import com.multi.ServiceConfig;
import com.multi.service.EmployeeService;
import com.service.EmployeeServiceDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MulitTest {

    @org.junit.Test
    public  void test(){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ServiceConfig.class);
        EmployeeService employeeService=context.getBean(EmployeeService.class);
       employeeService.insert();
    }
}
