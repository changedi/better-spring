package com.cloudex.spring.ioc;

/**
 * Created by zunyuan.jy on 16/10/5.
 */
public class TestLazyInitBean {

    public TestLazyInitBean() {
        System.out.println("lazy init...");
    }

    public void sayHello() {
        System.out.println("hello lazy.");
    }
}
