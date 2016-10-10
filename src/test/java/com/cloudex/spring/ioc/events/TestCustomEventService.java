package com.cloudex.spring.ioc.events;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by zunyuan.jy on 16/10/9.
 */
public class TestCustomEventService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;


    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public void customExecute() {
        System.out.println("service execute...");
        publisher.publishEvent(new TestCustomEvent(this, "event-custom-1"));
        publisher.publishEvent(new TestCustomEvent(this, "event-custom-2"));
        publisher.publishEvent(new TestCustomGenericEvent<Integer>(3));
    }
}
