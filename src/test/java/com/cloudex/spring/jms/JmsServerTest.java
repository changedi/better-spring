package com.cloudex.spring.jms;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zunyuan.jy on 16/12/12.
 */
public class JmsServerTest {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext(new String[]{"classpath:spring/spring-jms-server.xml"});
        System.out.println("jms server start.");
    }
}
