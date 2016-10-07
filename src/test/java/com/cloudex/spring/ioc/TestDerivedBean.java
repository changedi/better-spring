package com.cloudex.spring.ioc;

/**
 * Created by zunyuan.jy on 16/10/6.
 */
public class TestDerivedBean extends TestAbstractBean {
    @Override
    public void sayHello() {
        System.out.println(this.getClass() + " say hello.. " + name);
    }
}
