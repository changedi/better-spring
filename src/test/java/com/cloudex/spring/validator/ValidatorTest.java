package com.cloudex.spring.validator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zunyuan.jy on 16/10/15.
 */
public class ValidatorTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"classpath:spring/spring-validator-beans.xml"});

        System.out.println("-------------------------------------------");

        TestPersonValidator testPersonValidator = ctx.getBean("testPersonValidator", TestPersonValidator.class);

    }
}
