package com.cloudex.spring.aop;

import org.springframework.stereotype.Component;

/**
 * Created by zunyuan.jy on 16/10/20.
 */
@Component
public class TestBean {

    public void sayHello() {
        System.out.println(this + " hello.");
    }

    public void sayBye() {
        System.out.println(this + " bye.");
    }

    public String ret1() {
        return "a";
    }
}
