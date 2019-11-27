package com.serivce;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptSerivceDao serivceDao=context.getBean("employeeSerivce",DeptSerivceDao.class);
        serivceDao.deleteWholeDeptById(74);
    }
}
