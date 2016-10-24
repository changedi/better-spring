package com.cloudex.spring.aop.schema;

import org.springframework.stereotype.Component;

/**
 * Created by zunyuan.jy on 16/10/23.
 */
@Component
public class TestBean {

    public void sayHello() {
        System.out.println(this + " hello.");
    }

    public void sayBye() {
        System.out.println(this + " bye.");
    }
}
