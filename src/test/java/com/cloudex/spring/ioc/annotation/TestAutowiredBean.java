package com.cloudex.spring.ioc.annotation;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by zunyuan.jy on 16/10/8.
 */
@Component
public class TestAutowiredBean {

    @Resource
    private TestRequiredBean testRequiredBean;

    @Resource
    private TestPrototypeBean testPrototypeBean;

    public void sayHello() {
        testRequiredBean.sayHello();
        testPrototypeBean.sayHello();
    }
}
