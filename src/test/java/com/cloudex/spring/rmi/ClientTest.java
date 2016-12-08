package com.cloudex.spring.rmi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by zunyuan.jy on 16/12/7.
 */
public class ClientTest {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:spring/spring-rmi-client.xml");

        SimpleClient simpleClient = context.getBean(SimpleClient.class);
        List<Account> list = simpleClient.getAccount("John");
        list.forEach(System.out::println);
    }
}
