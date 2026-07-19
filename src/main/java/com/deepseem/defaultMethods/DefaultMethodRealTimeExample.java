package com.deepseem.defaultMethods;

public class DefaultMethodRealTimeExample {

    public static void main(String[] args) {

        Notification notification =
                new EmailNotification();

        notification.send("Order Placed");
    }
}
