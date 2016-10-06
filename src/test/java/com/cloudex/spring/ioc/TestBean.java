package com.cloudex.spring.ioc;

/**
 * Created by zunyuan.jy on 16/10/2.
 */
public class TestBean {

    public TestBean() {
        System.out.println("bean init...");
    }

    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}
