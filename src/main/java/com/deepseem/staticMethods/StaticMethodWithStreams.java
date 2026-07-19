package com.deepseem.staticMethods;

import java.util.Arrays;

public class StaticMethodWithStreams {

    public static void main(String[] args) {

        Arrays.asList("java", "spring", "kafka")
                .stream()
                .map(StringUtil::toUpper)
                .forEach(System.out::println);
    }
}
