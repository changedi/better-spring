package com.cloudex.spring.ioc.events;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zunyuan.jy on 16/10/9.
 */
public class CustomEventTest {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"classpath:spring/spring-event-beans.xml"});

        TestCustomEventService testCustomEventService = context.getBean("testCustomEventService", TestCustomEventService.class);
        testCustomEventService.customExecute();
        System.out.println("context finished.");
    }
}
