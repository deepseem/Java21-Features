package com.deepseem.staticMethods;

public interface Validator {

    static boolean isNullOrEmpty(String value) {
        return value == null || value.isEmpty();
    }
}

