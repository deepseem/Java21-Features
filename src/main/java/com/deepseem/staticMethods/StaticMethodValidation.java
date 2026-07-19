package com.deepseem.staticMethods;

public class StaticMethodValidation {
    public static void main(String[] args) {

        System.out.println(
                EmailValidator.validate("abc@gmail.com"));

        System.out.println(
                EmailValidator.validate("abc.com"));
    }
}
