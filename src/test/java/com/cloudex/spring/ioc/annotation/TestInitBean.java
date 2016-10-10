package com.cloudex.spring.ioc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by zunyuan.jy on 16/10/8.
 */
@Component
public class TestInitBean {

    @Resource
    private ApplicationContext context;

    @PostConstruct
    public void init() {
        System.out.println(this.getClass() + " initialize...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println(this.getClass() + " destroy...");
    }

    public void sayHello() {
        System.out.println(this.getClass() + " say hello... " + context.getDisplayName());
    }
}
