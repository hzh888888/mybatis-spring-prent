package com.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext_lifecycle.xml");
        EmployeeDaoLifeCycle employeeDaoLifeCycle=context.getBean("daoLife",com.lifecycle.EmployeeDaoLifeCycle.class);
        EmployeeDaoLifeCycle employeeDaoLifeCycle1=context.getBean("daoLife",com.lifecycle.EmployeeDaoLifeCycle.class);

        ((ConfigurableApplicationContext)context).close();
    }
}
