package com.deepseem.methodReference;

public class CustomMethodReference {
    public static void display(String message) {
        System.out.println("Message : " + message);
    }

    public static void main(String[] args) {

        Printer printer = CustomMethodReference::display;

        printer.print("Welcome to Java 8");
    }
}
