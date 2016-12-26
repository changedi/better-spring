package com.cloudex.spring.mail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zunyuan.jy on 16/12/25.
 */
public class MailSenderTest {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:spring/spring-mail.xml");
        OrderManager orderManager = context.getBean("orderManager", SimpleOrderManager.class);
        Order order = new Order();
        order.setOrderNumber("111");
        Customer customer = new Customer();
        customer.setEmailAddress("johnsmith@abcdef.com");
        customer.setFirstName("John");
        customer.setLastName("Smith");
        order.setCustomer(customer);
        orderManager.placeOrder(order);
    }
}
