package com.deepseem.defaultMethods;

public interface Greeting {
    default void welcome() {
        System.out.println("Welcome");
    }

    void sayHello(String name);
}
