package com.cloudex.spring.ioc.annotation;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by zunyuan.jy on 16/10/13.
 */
@Component
@DependsOn(value = {"testDepend1Bean"})
public class TestDepend2Bean {

    @Resource
    private TestDepend1Bean testDepend1Bean;

    public void sayHello() {
        System.out.println(this.getClass() + " say hello.");
    }
}
