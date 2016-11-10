package com.cloudex.spring.ioc.annotation;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by zunyuan.jy on 16/11/2.
 */
public class InspectorTest {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"classpath:spring/spring-annotation-beans.xml"});
        // add a shutdown hook for the above context...
        context.registerShutdownHook();
        System.out.println("------------------spring start--------------------");
        Set<String> beanNames = Arrays.stream(context.getBeanDefinitionNames())
                .collect(Collectors.toSet());
        beanNames.stream()
                .filter(beanName -> !beanName.startsWith("org.springframework"))
                .forEach(beanName -> {
                    BeanDefinition beanDefinition = context.getBeanFactory().getBeanDefinition(beanName);
                    System.out.println(beanDefinition.getBeanClassName());
                    try {
                        Class clz = Class.forName(beanDefinition.getBeanClassName());
                        Field[] fields = clz.getDeclaredFields();
                        if (fields.length > 0) {
                            Arrays.stream(fields)
                                    .filter(field -> beanNames.contains(field.getName()))
                                    .forEach(field -> System.out.println("\t\t\t" + field.getName()));
                        }
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                });

        System.out.println("------------------spring finish--------------------");
    }
}
