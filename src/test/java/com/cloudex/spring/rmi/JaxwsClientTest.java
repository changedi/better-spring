package com.cloudex.spring.rmi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by zunyuan.jy on 16/12/8.
 */
public class JaxwsClientTest {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:spring/spring-rmi-jaxwsclient.xml");
        AccountClientImpl client = context.getBean("client", AccountClientImpl.class);
        List<Account> list = client.getAccounts("Bob");
        list.forEach(System.out::println);
    }
}
