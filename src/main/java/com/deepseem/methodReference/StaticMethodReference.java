package com.deepseem.methodReference;

import java.util.Arrays;
import java.util.List;

public class StaticMethodReference {
    public static void print(String value) {
        System.out.println(value);
    }

    public static void main(String[] args) {

        List<String> list =
                Arrays.asList("Java","Spring","Kafka");

        list.forEach(StaticMethodReference::print);
    }
}
