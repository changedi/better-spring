package com.cloudex.spring.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.IOException;

/**
 * Created by zunyuan.jy on 16/10/11.
 */
public class ResourceTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"classpath:spring/spring-resource-beans.xml"});

        System.out.println("-------------------------------------------");

        TestResourceLoaderBean testResourceLoaderBean = ctx.getBean("testResourceLoaderBean", TestResourceLoaderBean.class);
        testResourceLoaderBean.load();

        TestResourcePropertyBean testResourcePropertyBean = ctx.getBean("testResourcePropertyBean", TestResourcePropertyBean.class);
        testResourcePropertyBean.load();

        try {
            File file = ctx.getResource("classpath:config/").getFile();
            System.out.println(file.isDirectory());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
