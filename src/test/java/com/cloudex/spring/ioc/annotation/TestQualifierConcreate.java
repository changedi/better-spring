package com.cloudex.spring.ioc.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by zunyuan.jy on 16/11/10.
 */
@Component
@Qualifier("someFunnyBean")
public class TestQualifierConcreate implements TestQualifierInstance {

    @Override
    public void sayHello() {
        System.out.println("i am some funny bean");
    }
}
