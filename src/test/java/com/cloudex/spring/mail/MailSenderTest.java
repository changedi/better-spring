package com.cloudex.spring.mail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zunyuan.jy on 16/12/25.
 */
public class MailSenderTest {

    public static void main(String[] args) {
        ApplicationContext appContext =
                new ClassPathXmlApplicationContext("classpath:spring/spring-oxm.xml");
    }
}
