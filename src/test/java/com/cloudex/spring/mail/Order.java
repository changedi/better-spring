package com.cloudex.spring.mail;

/**
 * Created by zunyuan.jy on 16/12/25.
 */
public class Order {

    private String orderNumber;

    private Customer customer;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
