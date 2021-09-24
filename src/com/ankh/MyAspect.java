package com.ankh;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Pointcut("execution(* com.ankh.*.*(..))")
    private void myPointCut(){}
    @Before("myPointCut()")
    public void myBefore(JoinPoint joinPoint) {
        System.out.println("before.....");
    }
}
