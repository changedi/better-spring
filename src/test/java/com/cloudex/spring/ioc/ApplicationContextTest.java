package com.cloudex.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zunyuan.jy on 16/10/2.
 */
public class ApplicationContextTest {

    public static void main(String[] args) {
        System.out.println("start load spring context.");
        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"classpath:spring/spring-context.xml"});
        System.out.println("finish load spring context beans.");
        System.out.println("-------------------------------------------------------------");
        TestBean testBean = context.getBean("testBean", TestBean.class);
        testBean.sayHello("Jim");
        TestBean testBean2 = context.getBean("testBean2", TestBean.class);
        testBean2.sayHello("James");
        System.out.println(testBean.equals(testBean2));

        TestFactoryBean testFactoryBean = context.getBean("testFactoryBean", TestFactoryBean.class);
        testFactoryBean.sayHello();

        TestConstructorBean testConstructorBean = context.getBean("testConstructorBean", TestConstructorBean.class);
        testConstructorBean.sayHello();

        TestPropertyBean testPropertyBean = context.getBean("testPropertyBean", TestPropertyBean.class);
        testPropertyBean.sayHello();

        TestLazyInitBean testLazyInitBean = context.getBean("testLazyInitBean", TestLazyInitBean.class);
        testLazyInitBean.sayHello();

        TestCommandManager testCommandManager = context.getBean("testCommandManager", TestCommandManager.class);
        testCommandManager.process("a");
        testCommandManager.process("b");
    }
}
