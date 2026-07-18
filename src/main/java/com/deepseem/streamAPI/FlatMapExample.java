package com.deepseem.streamAPI;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {

        List<List<String>> list =
                Arrays.asList(
                        Arrays.asList("Java","Spring"),
                        Arrays.asList("Kafka","Docker")
                );

        list.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
