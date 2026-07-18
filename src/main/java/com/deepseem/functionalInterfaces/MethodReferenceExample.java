package com.deepseem.functionalInterfaces;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Java", "Spring", "Kafka");

        names.forEach(System.out::println);
    }
}
