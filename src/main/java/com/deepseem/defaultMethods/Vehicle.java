package com.deepseem.defaultMethods;

public interface Vehicle {
    default void start() {
        System.out.println("Vehicle Started");
    }
}
