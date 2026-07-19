package com.deepseem.defaultMethods;

public interface Printer {

    default void print() {
        System.out.println("Printer");
    }
}

interface Scanner {

    default void print() {
        System.out.println("Scanner");
    }
}

class Machine implements Printer, Scanner {

    @Override
    public void print() {
        Printer.super.print();
    }
}

