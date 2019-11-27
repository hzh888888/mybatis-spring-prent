package com.param;

import com.EmployeeSerivceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_param.xml");
        EmployeeSerivceImpl service = context.getBean("employeeService", EmployeeSerivceImpl.class);

        int result = service.add(5, 6);

        System.out.println(result);
    }
}
