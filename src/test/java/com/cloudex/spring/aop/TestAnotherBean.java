package com.cloudex.spring.aop;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by zunyuan.jy on 16/10/22.
 */
@Component
public class TestAnotherBean {

    @Resource
    private TestInterface testBean;

    public void sayHello() {
        testBean.doPrint("Kate");
    }
}
