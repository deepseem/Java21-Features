package com.deepseem.streamAPI;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JoinStrings {
    public static void main(String[] args) {
        String result =
                Arrays.asList("Java","Spring","Kafka")
                        .stream()
                        .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
