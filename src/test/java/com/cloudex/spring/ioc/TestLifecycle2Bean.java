package com.cloudex.spring.ioc;

import org.springframework.context.Lifecycle;

/**
 * Created by zunyuan.jy on 16/10/6.
 */
public class TestLifecycle2Bean implements Lifecycle {

    private int sw = 0;

    @Override
    public void start() {
        System.out.println(this.getClass() + " start...");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass() + " stop...");
    }

    @Override
    public boolean isRunning() {
        return true;
    }

    public void sayHello() {
        System.out.println(this.getClass() + " say hello...");
        sw = 1;
    }
}
