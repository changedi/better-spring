package com.cloudex.spring.jmx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zunyuan.jy on 16/12/15.
 */
public class JmxTest {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:spring/spring-jmx.xml"});
        System.out.println("jmx server start.");
    }
}
