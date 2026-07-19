package com.deepseem.staticMethods;

public interface EmailValidator {
    static boolean validate(String email) {
        return email.contains("@");
    }
}
