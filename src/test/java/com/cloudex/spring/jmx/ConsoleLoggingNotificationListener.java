package com.cloudex.spring.jmx;

import javax.management.AttributeChangeNotification;
import javax.management.Notification;
import javax.management.NotificationFilter;
import javax.management.NotificationListener;

/**
 * Created by zunyuan.jy on 16/12/20.
 */
public class ConsoleLoggingNotificationListener implements NotificationListener, NotificationFilter {

    public void handleNotification(Notification notification, Object handback) {
        System.out.println(notification);
        System.out.println(handback);
    }

    public boolean isNotificationEnabled(Notification notification) {
        System.out.println("filter:" + AttributeChangeNotification.class.isAssignableFrom(notification.getClass()));
        return AttributeChangeNotification.class.isAssignableFrom(notification.getClass());
    }

}
