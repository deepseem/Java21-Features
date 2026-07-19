package com.deepseem.optional;

import java.util.Optional;

public class AvoidNullPointerException {
    public static void main(String[] args) {

        String value = null;

        int length =
                Optional.ofNullable(value)
                        .map(String::length)
                        .orElse(0);

        System.out.println(length);
    }
}
