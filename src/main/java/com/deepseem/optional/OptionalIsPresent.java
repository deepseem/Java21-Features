package com.deepseem.optional;

import java.util.Optional;

public class OptionalIsPresent {
    public static void main(String[] args) {

        Optional<String> optional =
                Optional.of("Spring Boot");

        if (optional.isPresent()) {
            System.out.println(optional.get());
        }
    }
}
