package com.cloudex.spring.ioc.purejava;

import org.springframework.stereotype.Component;

/**
 * Created by zunyuan.jy on 16/10/8.
 */
@Component
public class TestServiceBean {

    //    @Value("${cloudex.spring.name}")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println(this.getClass() + " say hello... " + name);
    }
}
