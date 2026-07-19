package com.deepseem.staticMethods;

public interface Logger {
    static void info(String message) {
        System.out.println("[INFO] " + message);
    }

    static void error(String message) {
        System.out.println("[ERROR] " + message);
    }
}

