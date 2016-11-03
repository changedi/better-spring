package com.cloudex.spring.ioc;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * Created by zunyuan.jy on 16/11/2.
 */
public class InspectorTest {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"classpath:spring/spring-beans.xml"});
        // add a shutdown hook for the above context...
        context.registerShutdownHook();
        System.out.println("------------------spring start--------------------");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//        context.getBeanFactory().getBeanDefinition()
        System.out.println("------------------spring finish--------------------");
    }
}
