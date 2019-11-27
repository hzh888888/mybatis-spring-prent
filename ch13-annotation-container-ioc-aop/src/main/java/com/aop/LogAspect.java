package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

    @Pointcut("execution(* com.serivce..*.*(..))")
    public void myPointcut(){

    }

    @Before("myPointcut()")
    public void before(){
        System.out.println("before-------");
    }

    @After("myPointcut()")
    public void after(){
        System.out.println("after----------------");
    }

   @AfterReturning(pointcut = "myPointcut()",returning = "re")
    public void afterReturn(int re){
       System.out.println(re);
    }

    @AfterThrowing(pointcut ="myPointcut()",throwing = "re",argNames = "re")
    public void afterThrow(RuntimeException re){
        System.out.println("after throw----" + re);
    }

    @Around("myPointcut()")
    public Object around(ProceedingJoinPoint joinPoint){
        Object resut=null;

        try {
            System.out.println("before in around---");
            resut=joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return resut;
    }
}

