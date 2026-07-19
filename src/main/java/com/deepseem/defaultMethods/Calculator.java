package com.deepseem.defaultMethods;
@FunctionalInterface
public interface Calculator {
    int addition(int a,int b);
    static int add(int a, int b) {
        return a + b;
    }
    default void message() {
        System.out.println("Calculator");
    }
}

