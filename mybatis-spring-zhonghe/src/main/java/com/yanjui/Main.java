package com.yanjui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext conet=new ClassPathXmlApplicationContext("applicationContext_complex.xml");
//        A a= conet.getBean("getA",com.yanjui.A.class);
//        System.out.println(a);
    }
}
