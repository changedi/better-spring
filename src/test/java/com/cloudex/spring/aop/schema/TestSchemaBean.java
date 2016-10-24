package com.cloudex.spring.aop.schema;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by zunyuan.jy on 16/10/23.
 */
public class TestSchemaBean {

    public void doBefore() {
        System.out.println("this is a before advice.");
    }

    public void doAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before.");
        pjp.proceed();
        System.out.println("around after");
    }
}
