package com.cloudex.spring.aop.schema;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zunyuan.jy on 16/10/23.
 */
public class AopSchemaTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-aop-schema-beans.xml");
        TestBean testBean = context.getBean("testBean", TestBean.class);
        testBean.sayHello();

        testBean.sayBye();
    }
}
