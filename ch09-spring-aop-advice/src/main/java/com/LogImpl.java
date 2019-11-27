package com;

import org.aspectj.lang.ProceedingJoinPoint;

import java.sql.SQLException;

public class LogImpl {

    public void befor(){
        System.out.println("befor***************");
    }

    public void befor2(){
        System.out.println("befor2**************************");
    }


    public void after(){
        System.out.println("after***********************");
    }

    public void afterReturn(){
        System.out.println("afterRurn*********************");
    }

    public void throwAdvice(SQLException re){
        System.out.println("re = " + re);
        System.out.println("throwAdvice*****************");
    }

    public Object aroundAdvice(ProceedingJoinPoint joinPoint){
        Object restul=null;
        System.out.println("aroundAdvice befor******************");
        try {
            restul =joinPoint.proceed();
//             System.out.println("aroundAdvice return********");
        }catch (Throwable throwable){
            System.out.println("aroundAdvice throw********************");
        }

        System.out.println("aroundAdvice after************************");
        return restul;
    }

    public Object aroundAdvice2(ProceedingJoinPoint joinPoint){
        Object restul=null;
        System.out.println("aroundAdvice befor222******************");
        try {
            restul =joinPoint.proceed();
//            System.out.println("aroundAdvice return222********");
        }catch (Throwable throwable){
            System.out.println("aroundAdvice throw222********************");
        }

        System.out.println("aroundAdvice after222************************");
        return restul;
    }
}
