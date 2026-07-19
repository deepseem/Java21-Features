package com.deepseem.optional;

import java.util.Optional;

public class OptionalOrElseGet {
    public static void main(String[] args) {

        String value = null;

        String result =
                Optional.ofNullable(value)
                        .orElseGet(() -> "Generated Value");

        System.out.println(result);
    }
}
