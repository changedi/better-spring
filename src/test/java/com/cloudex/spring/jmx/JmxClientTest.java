package com.cloudex.spring.jmx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zunyuan.jy on 16/12/15.
 */
public class JmxClientTest {


    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:spring/spring-jmx-client.xml"});

        IJmxTestBean proxy = (IJmxTestBean) context.getBean("proxy");
        int r = proxy.add(1, 2);
        System.out.println(r);
    }
}
