package com.cloudex.spring.ioc.annotation;

import org.springframework.stereotype.Component;

/**
 * Created by zunyuan.jy on 16/10/8.
 */
@Component
public class TestRequiredBean {

    private String name;

    public String getName() {
        return name;
    }

    //@Required
    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println(this.getClass() + " say hello ... " + name);
    }
}
