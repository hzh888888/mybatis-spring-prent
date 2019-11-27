package com.service.log;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.sql.Connection;

public class LogImpl implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
            Object object=null;
            Object[] objects=methodInvocation.getArguments();
        Connection connection= (Connection) objects[0];
         try {
             connection.setAutoCommit(false);
             object=  methodInvocation.proceed();
             connection.commit();
             connection.setAutoCommit(true);
        }catch (Throwable throwable){
             connection.rollback();
         }

         return object;
    }
}
