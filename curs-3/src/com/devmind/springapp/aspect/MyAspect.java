package com.devmind.springapp.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class MyAspect {
    @Pointcut("execution(public String *(..))")
    private void anyPublicStringOperation() {}

    @Before(value = "anyPublicStringOperation()", argNames = "joinPoint")
    public void beforeCall(JoinPoint joinPoint) {
        System.out.println("Metoda:"+joinPoint.getSignature().toShortString());
    }
}
