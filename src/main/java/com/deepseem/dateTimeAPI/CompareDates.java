package com.deepseem.dateTimeAPI;

import java.time.LocalDate;

public class CompareDates {
    public static void main(String[] args) {

        LocalDate d1 =
                LocalDate.of(2025,1,1);

        LocalDate d2 =
                LocalDate.now();

        System.out.println(d2.isAfter(d1));
    }
}
