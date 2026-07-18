package com.deepseem.streamAPI;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {
    public static void main(String[] args) {

        List<String> list =
                Arrays.asList("Java","Spring","Kafka");

        System.out.println(
                list.stream()
                        .findFirst()
                        .orElse("Not Found"));
    }
}
