package com.cloudex.spring.ioc.events;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;

/**
 * Created by zunyuan.jy on 16/10/9.
 */
public class TestOrderCustomEventNotifier {

    @EventListener(condition = " #event.getEventDetail()=='event-custom-2' ")
    @Order(4)
    public void processCustomEvent(TestCustomEvent event) {
        System.out.println("Order receive event of " + event);
    }
}
