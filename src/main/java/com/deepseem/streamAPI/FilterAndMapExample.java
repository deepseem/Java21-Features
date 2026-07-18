package com.deepseem.streamAPI;

import java.util.Arrays;
import java.util.List;

public class FilterAndMapExample {
    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Java","Spring","Kafka","Go");

        names.stream()
                .filter(name -> name.length() > 4)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
