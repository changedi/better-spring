package com.cloudex.spring.aop;

import org.springframework.stereotype.Component;

/**
 * Created by zunyuan.jy on 16/10/20.
 */
@Component
public class TestBean {

    public void sayHello(String name) {
        System.out.println(this + " hello " + name);
    }

    public void sayBye() {
        System.out.println(this + " bye.");
    }

    public String ret1() {
        return "a";
    }

    public void exception() throws Exception {
        throw new Exception("aop test");
    }

    public void around() {
        System.out.println(this + " around.");
    }

    @TestAnnotation(value = "test", key = 100)
    public void withAnnotation() {
        System.out.println(this + " with annotation.");
    }
}
