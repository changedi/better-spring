package com.cloudex.spring.ioc.events;

import org.springframework.context.ApplicationListener;

/**
 * Created by zunyuan.jy on 16/10/9.
 */
public class TestCustomEventNotifier implements ApplicationListener<TestCustomEvent> {
    @Override
    public void onApplicationEvent(TestCustomEvent event) {
        System.out.println("receive event of ... " + event);
    }
}
