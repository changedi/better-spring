package com.cloudex.spring.ioc.events;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;

/**
 * Created by zunyuan.jy on 16/10/9.
 */
public class TestAnyCustomEventNotifier {

    @EventListener(condition = " #event.getEventDetail()=='event-custom-2' ")
    @Order(5)
    public void processCustomEvent(TestCustomEvent event) {
        System.out.println("Any receive event of " + event);
    }

    @EventListener(condition = " #event.getEventDetail()=='event-custom-2' ")
    @Async
    @Order(3)
    public void asyncHandleCustomEvent(TestCustomEvent event) {
        System.out.println("Async receive event of " + event);
    }

    @EventListener
    public void onGenericEvent(TestCustomGenericEvent<Integer> event) {
        System.out.println("Generic receive event of " + event.getSource());
    }
}
