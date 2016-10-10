package com.cloudex.spring.ioc.purejava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zunyuan.jy on 16/10/8.
 */
public class JavaBasedContainerTest {

    public static void main(String[] args) {
        System.out.println("start load spring context.");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("dev");
        ctx.register(AppConfig.class, AppDevConfig.class);
        ctx.refresh();

        System.out.println("finish load spring context beans.");
        System.out.println("--------------------------start line---------------------------");

        TestServiceBean testServiceBean = ctx.getBean("testServiceBean", TestServiceBean.class);
        testServiceBean.sayHello();

        TestBean testBean = ctx.getBean(TestBean.class);
        testBean.sayHello();

        System.out.println("--------------------------last line----------------------------");
    }
}
