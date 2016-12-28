package com.cloudex.spring.taskexecution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zunyuan.jy on 16/12/28.
 */
public class TaskExecutorTest {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:spring/spring-task-executor.xml");
        TaskExecutorExample taskExecutorExample = context.getBean("taskExecutorExample", TaskExecutorExample.class);
        taskExecutorExample.printMessages();

    }
}
