package com.cloudex.spring.ioc;

/**
 * Created by zunyuan.jy on 16/10/7.
 */
public class TestConfigPropertyBean {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println(this.getClass() + " say hello to " + name);
    }
}
