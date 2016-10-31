package com.cloudex.spring.aop.springstyle;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


/**
 * Created by zunyuan.jy on 16/10/29.
 */
public class AroundIntercepter implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println(this + " Before invocation.");
        Object v = methodInvocation.proceed();
        System.out.println(this + " After invocation.");
        return v;
    }
}
