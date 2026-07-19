package com.deepseem.optional;

import java.util.Optional;

public class OptionalOfNullable {
    public static void main(String[] args) {

        String name = null;

        Optional<String> optional =
                Optional.ofNullable(name);

        System.out.println(optional);
    }
}
