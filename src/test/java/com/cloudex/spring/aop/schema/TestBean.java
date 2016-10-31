package com.cloudex.spring.aop.schema;

/**
 * Created by zunyuan.jy on 16/10/23.
 */
public class TestBean {

    public void sayHello() {
        System.out.println(this + " hello.");
    }

    public void sayBye() {
        System.out.println(this + " bye.");
    }
}
