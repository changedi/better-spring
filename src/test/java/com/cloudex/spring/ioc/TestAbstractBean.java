package com.cloudex.spring.ioc;

/**
 * Created by zunyuan.jy on 16/10/6.
 */
public abstract class TestAbstractBean {

    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void sayHello();
}
