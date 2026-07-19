package com.deepseem.optional;

import java.util.Optional;

public class OptionalOrElse {
    public static void main(String[] args) {

        String value = null;

        String result =
                Optional.ofNullable(value)
                        .orElse("Default Value");

        System.out.println(result);
    }
}
