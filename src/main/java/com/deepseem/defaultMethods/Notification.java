package com.deepseem.defaultMethods;

public interface Notification {
    void send(String message);

    default void log(String message) {
        System.out.println("Log : " + message);
    }
}

class EmailNotification implements Notification {

    @Override
    public void send(String message) {

        System.out.println("Sending Email : " + message);

        log(message);
    }
}

