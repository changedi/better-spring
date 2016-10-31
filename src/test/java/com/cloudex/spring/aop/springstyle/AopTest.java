package com.cloudex.spring.aop.springstyle;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zunyuan.jy on 16/10/29.
 */
public class AopTest {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"classpath:spring/spring-aop-spring-beans.xml"});

        TestBean testBean = context.getBean("testBean", TestBean.class);

        testBean.sayHello();

        testBean.getBugs();

        testBean.sayBye();

        Lockable lock = (Lockable) testBean;
        lock.lock();

    }
}
