package com.deepseem.staticMethods;

public interface Notification {
    static void log() {
        System.out.println("Static Log");
    }

    default void send() {
        System.out.println("Default Send");
    }
}

class EmailNotification implements Notification {
}
