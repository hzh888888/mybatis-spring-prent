package com.lifecycle;

public class EmployeeDaoLifeCycle {

    public void intit(){
        System.out.println("这个类的初始化代码，不是在构造函数中");
    }

    public void intit2(){
        System.out.println("2这个类的初始化代码，不是在构造函数中");
    }

    public void destroy(){
        System.out.println("销毁");
    }
}
