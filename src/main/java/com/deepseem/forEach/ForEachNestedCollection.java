package com.deepseem.forEach;

import java.util.Arrays;
import java.util.List;

public class ForEachNestedCollection {
    public static void main(String[] args) {

        List<List<String>> list =
                Arrays.asList(
                        Arrays.asList("Java","Spring"),
                        Arrays.asList("Kafka","Docker"));

        list.forEach(inner ->
                inner.forEach(System.out::println));
    }
}
