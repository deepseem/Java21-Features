package com.deepseem.forEach;

import java.util.Arrays;
import java.util.List;

public class ForEachWithList {
    public static void main(String[] args) {

        List<String> technologies =
                Arrays.asList(
                        "Java",
                        "Spring Boot",
                        "Kafka",
                        "Docker");

        technologies.forEach(System.out::println);
    }
}
