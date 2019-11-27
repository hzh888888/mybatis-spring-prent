package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceAspect {

    @Pointcut("execution(* com.service..*.*(..))")
    public void myPoincut(){

    }

        @Around("myPoincut()")
        public Object performance(ProceedingJoinPoint joinPoint){
            Object resut=null;
            try {
                Long start=System.currentTimeMillis();
                resut=joinPoint.proceed();
                Long end=System.currentTimeMillis();
                System.out.println("耗时:"+(start-end));
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
            return resut;
        }
}
