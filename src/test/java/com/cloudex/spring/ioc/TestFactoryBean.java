package com.cloudex.spring.ioc;

/**
 * Created by zunyuan.jy on 16/10/2.
 */
public class TestFactoryBean {

    private static TestFactoryBean testFactoryBean = new TestFactoryBean();

    private TestFactoryBean() {
    }

    public static TestFactoryBean staticCreateInstance() {
        return testFactoryBean;
    }

    public TestFactoryBean createInstance() {
        return testFactoryBean;
    }

    public void sayHello() {
        System.out.println("hello factory method.");
    }
}
