package com.sid.springboot.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class BeforeAdvice {

    // setup logger
    private Logger myLogger = Logger.getLogger(getClass().getName());

    // add @Before advice
    @Before(("com.sid.springboot.aspect.AopExpressions.forAppFlow()"))
    public void before(JoinPoint theJoinPoint){

        // display the method we are calling
        String method = theJoinPoint.getSignature().toShortString();
        myLogger.info("=====>>> in @Before: calling method: " + method);

        // display the arguments to the method

        // get the arguments
        Object[] args = theJoinPoint.getArgs();

        // loop through and display the arguments
        for(Object temp : args){
            myLogger.info("=====>>> argument: " + temp);
        }

    }


}
