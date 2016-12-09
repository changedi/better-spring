package com.cloudex.spring.rmi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zunyuan.jy on 16/12/8.
 */
public class JaxwsTest {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:spring/spring-rmi-jaxws.xml");
        //启动ws服务端
        System.out.println("server start.");
//        AccountService
        System.out.println();
    }
}
