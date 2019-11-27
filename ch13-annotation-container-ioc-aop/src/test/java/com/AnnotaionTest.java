package com;

import com.dao.impl.EmployeeDaoImpl;
import com.serivce.EmployeeSerivce;
import com.serivce.impl.EmployeeSerivceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotaionTest {

    @Test
    public void testAnnoHelloWorld(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeSerivce employeeSerivce=context.getBean(EmployeeSerivce.class);
        employeeSerivce.insert();
    }


    @Test
    public void testAnno_ioc_collection(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeSerivceImpl employeeDao=context.getBean(EmployeeSerivceImpl.class);
        employeeDao.displayAutowireCollectionInject();
    }
}
