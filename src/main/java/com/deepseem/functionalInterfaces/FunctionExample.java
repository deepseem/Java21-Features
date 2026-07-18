package com.deepseem.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        Function<String, Integer> length = String::length;

        System.out.println(length.apply("Java"));
    }
}
