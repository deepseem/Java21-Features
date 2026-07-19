package com.deepseem.methodReference;

import java.util.Arrays;

public class ConvertToUpperCase {
    public static void main(String[] args) {

        Arrays.asList("java","spring","docker")
                .stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
