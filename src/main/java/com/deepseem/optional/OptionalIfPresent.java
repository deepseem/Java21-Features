package com.deepseem.optional;

import java.util.Optional;

public class OptionalIfPresent {
    public static void main(String[] args) {

        Optional<String> optional =
                Optional.of("Kafka");

        optional.ifPresent(System.out::println);
    }
}
