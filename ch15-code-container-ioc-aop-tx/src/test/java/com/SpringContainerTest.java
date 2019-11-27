package com;

import com.multi.dao.Employee1Dao;
import com.multi.dao.Employee1DaoImpl;
import com.multi.service.Employee1ServiceImpl;
import com.multi.service.EmployeeService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringContainerTest {

    @Test
    public void test(){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(Employee1DaoImpl.class);
        context.register(Employee1ServiceImpl.class);
        context.refresh();
        EmployeeService employeeService=context.getBean(EmployeeService.class);
        employeeService.insert();
    }

}
