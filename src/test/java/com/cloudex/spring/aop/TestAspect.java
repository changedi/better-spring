package com.cloudex.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by zunyuan.jy on 16/10/20.
 */
@Aspect
public class TestAspect {

    @Pointcut("execution(* com.cloudex.spring.aop.*.sayHello(..))")
    public void businessService() {
    }
//
//    @Pointcut("")
//    public void returnService(){}


    @Before("businessService()")
    public void doBefore() {
        System.out.println("here @Before sayHello().");
    }

    @Before("execution(* com.cloudex.spring.aop.*.sayBye(..))")
    public void doAccessCheck() {
        System.out.println("here @Before sayBye.");
    }

    @AfterReturning("execution(* com.cloudex.spring.aop.*.sayBye(..))")
    public void doAfterReturning() {
        System.out.println("here @AfterReturning sayBye.");
    }

    @AfterReturning(pointcut = "execution(* com.cloudex.spring.aop.*.ret1(..))", returning = "retVal")
    public void doAfterReturn(Object retVal) {
        System.out.println("here @AfterReturn ret1. with retVal:" + retVal);
    }

    @AfterThrowing(pointcut = "execution(* com.cloudex.spring.aop.*.exception(..))",
            throwing = "ex")
    public void doAfterException(Exception ex) {
        System.out.println("here @AfterThrowing exception. " + ex);
    }

    @After("execution(* com.cloudex.spring.aop.*.exception(..))")
    public void doAfterFinally() {
        System.out.println("here @AfterFinally exception. ");
    }
}
