package com.deepseem.functionalInterfaces;

public class CustomFunctionalInterface {
    public static void main(String[] args) {

        Calculator calculator = (a, b) -> a + b;

        System.out.println(calculator.add(10, 20));
    }
}
