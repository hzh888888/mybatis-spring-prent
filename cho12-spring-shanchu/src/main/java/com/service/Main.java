package com.service;

import com.service.impl.DeptEmpSerivceDao;
import com.util.GetConnection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptEmpSerivceDao serivceDao=context.getBean("deptEmpSerivceImpl", DeptEmpSerivceDao.class);
        Connection connection= GetConnection.getConnection();
         serivceDao.deleteDeptWithEmps(connection,91);
    }
}
