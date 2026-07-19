package com.deepseem.optional;

import java.util.Optional;

public class OptionalBestPractices {
    public static void main(String[] args) {

        String email = null;

        String result =
                Optional.ofNullable(email)
                        .filter(e -> e.contains("@"))
                        .map(String::toLowerCase)
                        .orElse("default@gmail.com");

        System.out.println(result);
    }
}
