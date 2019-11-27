package com.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)throws Exception {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptServiceDao serviceDao=context.getBean("deptService",DeptServiceDao.class);
        serviceDao.deleteWholeDeptById(81);
    }
}
