package com.cloudex.spring.aop;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zunyuan.jy on 16/10/20.
 */
public class AopTest {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"classpath:spring/spring-aop-beans.xml"});

        TestBean testBean = context.getBean("testBean", TestBean.class);

        testBean.sayHello("Jim");
        testBean.sayBye();
        testBean.ret1();
        try {
            testBean.exception();
        } catch (Exception e) {
            System.err.println("exception");
        } finally {
            System.err.println("finally");
        }
        testBean.around();
        testBean.withAnnotation();

        // according to introduction. here testBean is also implements TestInterface.
        TestInterface testInterface = (TestInterface) testBean;
        testInterface.doPrint("Green.");

        TestAnotherBean testAnotherBean = context.getBean("testAnotherBean", TestAnotherBean.class);
        testAnotherBean.sayHello();
    }
}
