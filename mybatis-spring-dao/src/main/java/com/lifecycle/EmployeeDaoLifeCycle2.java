package com.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EmployeeDaoLifeCycle2 implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("destroy--------------");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化---------------");
    }
}
