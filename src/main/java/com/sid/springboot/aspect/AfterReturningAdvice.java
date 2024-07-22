package com.sid.springboot.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class AfterReturningAdvice {

    // setup logger
    private Logger myLogger = Logger.getLogger(getClass().getName());

    // add @AfterReturning advice
    @AfterReturning(
            pointcut = "com.sid.springboot.aspect.AopExpressions.forAppFlow()",
            returning = "theResult"
    )
    public void afterReturning(JoinPoint theJoinPoint, Object theResult){

        // display the method we are returning from
        String method = theJoinPoint.getSignature().toShortString();
        myLogger.info("=====>>> in @AfterReturning: calling method: " + method);

        // display the data returned
        myLogger.info("======>>> result: " + theResult);

    }


}
