package com.deepseem.staticMethods;

public interface DiscountCalculator {
    static double calculate(double price, double percentage) {

        return price - (price * percentage / 100);
    }
}

