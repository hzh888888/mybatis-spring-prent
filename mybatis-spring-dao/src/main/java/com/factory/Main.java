package com.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext conet=new ClassPathXmlApplicationContext("applicationContext_factory.xml");
        A a= conet.getBean("factory2",com.factory.A.class);
        A a1= conet.getBean("factory2",com.factory.A.class);
        System.out.println(a);
        System.out.println(a1);
    }
}
