package com.sid.springboot.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopExpressions {
    
    // setup pointcut declarations
    @Pointcut("execution(* com.sid.springboot.controller.*.*(..))")
    public void forControllerPackage() {}

    @Pointcut("execution(* com.sid.springboot.service.*.*(..))")
    public void forServicePackage() {}

    @Pointcut("execution(* com.sid.springboot.dao.*.*(..))")
    public void forDaoPackage() {}

    @Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
    public void forAppFlow() {}
    
}
