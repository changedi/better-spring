package com.cloudex.spring.ioc.events;

import org.springframework.context.ApplicationEvent;
import org.springframework.core.ResolvableType;
import org.springframework.core.ResolvableTypeProvider;

/**
 * Created by zunyuan.jy on 16/10/9.
 */
public class TestCustomGenericEvent<T> extends ApplicationEvent implements ResolvableTypeProvider {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public TestCustomGenericEvent(T source) {
        super(source);
    }

    @Override
    public ResolvableType getResolvableType() {
        return ResolvableType.forClassWithGenerics(getClass(),
                ResolvableType.forInstance(getSource()));
    }
}
