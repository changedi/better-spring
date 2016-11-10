package com.cloudex.spring.ioc.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by zunyuan.jy on 16/10/8.
 */
@Component
public class TestQualifierBean {

    @Resource
    @Qualifier("first")
    private TestRequiredBean requiredBean;

    @Resource
    @Qualifier("someFunnyBean")
    private TestQualifierInstance funny;

    public void sayHello() {
        System.out.println(this.getClass() + " say hello ... " + requiredBean.getName());
        funny.sayHello();
    }
}
