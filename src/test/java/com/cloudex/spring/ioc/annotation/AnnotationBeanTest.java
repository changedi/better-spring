package com.cloudex.spring.ioc.annotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zunyuan.jy on 16/10/8.
 */
public class AnnotationBeanTest {

    public static void main(String[] args) {
        System.out.println("start load spring context.");
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"classpath:spring/spring-annotation-beans.xml"});

        // add a shutdown hook for the above context...
        context.registerShutdownHook();

        System.out.println("finish load spring context beans.");
        System.out.println("--------------------------start line---------------------------");

        TestRequiredBean testRequiredBean = context.getBean("testRequiredBean", TestRequiredBean.class);
        testRequiredBean.sayHello();

        TestAutowiredBean testAutowiredBean = context.getBean("testAutowiredBean", TestAutowiredBean.class);
        testAutowiredBean.sayHello();

        TestInitBean testInitBean = context.getBean("testInitBean", TestInitBean.class);
        testInitBean.sayHello();

        TestQualifierBean testQualifierBean = context.getBean("testQualifierBean", TestQualifierBean.class);
        testQualifierBean.sayHello();

        TestDepend1Bean testDepend1Bean = context.getBean("testDepend1Bean", TestDepend1Bean.class);
        testDepend1Bean.sayHello();
        TestDepend2Bean testDepend2Bean = context.getBean("testDepend2Bean", TestDepend2Bean.class);
        testDepend2Bean.sayHello();

        TestPrototypeBean testPrototypeBean = context.getBean("testPrototypeBean", TestPrototypeBean.class);
        testPrototypeBean.sayHello();

        System.out.println("--------------------------last line----------------------------");
    }
}
