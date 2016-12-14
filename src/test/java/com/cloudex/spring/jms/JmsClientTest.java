package com.cloudex.spring.jms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zunyuan.jy on 16/12/13.
 */
public class JmsClientTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                new String[]{"classpath:spring/spring-jms-client.xml"});

    }
}
