package com.deepseem.methodReference;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodReferenceUsingObject {
    public static void main(String[] args) {

        List<String> list =
                Arrays.asList("java","spring","kafka");

        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
