package com.deepseem.optional;

import java.util.Optional;

public class CreateOptional {
    public static void main(String[] args) {

        Optional<String> optional =
                Optional.of("Java 8");

        System.out.println(optional.get());
    }
}
