package com.cloudex.spring.ioc.events;

import org.springframework.context.ApplicationEvent;

/**
 * Created by zunyuan.jy on 16/10/9.
 */
public class TestCustomEvent extends ApplicationEvent {

    private String eventDetail;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public TestCustomEvent(Object source, String eventDetail) {
        super(source);
        this.eventDetail = eventDetail;
    }

    public String toString() {
        return this.getClass() + ":" + eventDetail;
    }

    public String getEventDetail() {
        return eventDetail;
    }
}
