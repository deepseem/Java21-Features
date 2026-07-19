package com.deepseem.defaultMethods;

public interface Logger {
    default void info() {
        print("INFO");
    }

    private void print(String level) {
        System.out.println(level);
    }
}
