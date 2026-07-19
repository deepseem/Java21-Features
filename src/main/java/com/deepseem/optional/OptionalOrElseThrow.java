package com.deepseem.optional;

import java.util.Optional;

public class OptionalOrElseThrow {
    public static void main(String[] args) {

        String value = null;

        String result =
                Optional.ofNullable(value)
                        .orElseThrow(() ->
                                new RuntimeException("Value Not Found"));

        System.out.println(result);
    }
}
