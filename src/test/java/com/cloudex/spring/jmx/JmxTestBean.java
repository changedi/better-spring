package com.cloudex.spring.jmx;

import org.springframework.jmx.export.notification.NotificationPublisher;
import org.springframework.jmx.export.notification.NotificationPublisherAware;

import javax.management.Notification;

/**
 * Created by zunyuan.jy on 16/12/15.
 */
public class JmxTestBean implements IJmxTestBean, NotificationPublisherAware {

    private String name;
    private int age;
    private boolean isSuperman;
    private NotificationPublisher publisher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSuperman() {
        return isSuperman;
    }

    public void setSuperman(boolean superman) {
        isSuperman = superman;
    }

    public int add(int x, int y) {
        this.publisher.sendNotification(new Notification("add", this, 0));
        return x + y;
    }

    @Override
    public long myOperation() {
        return 0;
    }

    @Override
    public void setNotificationPublisher(NotificationPublisher notificationPublisher) {
        this.publisher = notificationPublisher;
    }
}
