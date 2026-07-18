package com.deepseem.lambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorLambdaExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "John",
                "David",
                "Alex",
                "Bob");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println(names);
    }
}
