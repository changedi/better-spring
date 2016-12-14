package com.cloudex.spring.jms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.jms.JMSException;

/**
 * Created by zunyuan.jy on 16/12/12.
 */
public class JmsServerTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:spring/spring-jms-server.xml"});
        System.out.println("jms server start.");
        SimpleMessageProducer producer = (SimpleMessageProducer) context.getBean("producer");
        try {
            producer.sendMessages();
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
