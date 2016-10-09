package com.cloudex.spring.ioc.purejava;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zunyuan.jy on 16/10/8.
 */
@Service
public class TestBean {

    @Resource
    private TestServiceBean serviceBean;

    public void sayHello() {
        serviceBean.sayHello();
    }
}
