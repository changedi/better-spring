package com.cloudex.spring.aop.springstyle;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by zunyuan.jy on 16/10/29.
 */
public class TestBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("Before advice start...");
        System.out.println("\tTarget:" + o);
        System.out.println("\tMethod:" + method.getName());
        System.out.println("\tArguments:" + objects.length);
    }
}
