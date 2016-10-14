package com.cloudex.spring.ioc.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by zunyuan.jy on 16/10/14.
 */
@Component
@Scope(value = "prototype")
public class TestPrototypeBean {

    public TestPrototypeBean() {
        System.out.println(this + " init.");
    }

    public void sayHello() {
        System.out.println(this + " say hello.");
    }
}
