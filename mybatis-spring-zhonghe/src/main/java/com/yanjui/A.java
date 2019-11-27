package com.yanjui;
import org.springframework.beans.factory.InitializingBean;

public class A implements  InitializingBean{

    private B b;
    private C c;

    public A(B b, C c) {
        this.b = b;
        this.c = c;
        System.out.println("A构造函数");
    }


    public void setB(B b) {
        this.b = b;
        System.out.println("A的setB方法");
    }

    public void setC(C c) {
        this.c = c;
    }

    public void init()
    {
        System.out.println("init");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

}
