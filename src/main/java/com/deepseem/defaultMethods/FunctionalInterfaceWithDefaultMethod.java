package com.deepseem.defaultMethods;

public class FunctionalInterfaceWithDefaultMethod {
    public static void main(String[] args) {

        Calculator calculator =
                (a,b)->a+b;

        calculator.message();

        System.out.println(calculator.addition(20,30));
    }
}
