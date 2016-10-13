package com.cloudex.spring.ioc.annotation;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by zunyuan.jy on 16/10/13.
 */
@Component
//@DependsOn(value = {"testDepend2Bean"})//with this the two bean will conflict
public class TestDepend1Bean {

    @Resource
    private TestDepend2Bean testDepend2Bean;

    // this will cause a conflict.
//    public TestDepend1Bean() {
//        testDepend2Bean.sayHello();
//    }

    public void sayHello() {
        System.out.println(this.getClass() + " say hello.");
    }
}
