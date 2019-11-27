package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author cj
 * @date 2019/11/4
 */

@Component
@Aspect
public class LogAspect {

    @Pointcut("execution(* com.service..*.*(..))")
    public void myPointcut(){

    }

    @Before("myPointcut()")
    public void before(){
        System.out.println("before****");
    }

}
