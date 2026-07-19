package com.deepseem.staticMethods;

public class StaticMethodVsDefaultMethod {
    public static void main(String[] args) {

        EmailNotification email = new EmailNotification();

        email.send();

        Notification.log();
    }
}
