package com.deepseem.dateTimeAPI;

import java.time.LocalDate;

public class LeapYearExample {
    public static void main(String[] args) {

        System.out.println(
                LocalDate.of(2024,1,1).isLeapYear());
    }
}
