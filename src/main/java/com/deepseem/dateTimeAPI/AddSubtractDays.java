package com.deepseem.dateTimeAPI;

import java.time.LocalDate;

public class AddSubtractDays {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(today.plusDays(10));

        System.out.println(today.minusDays(5));
    }
}
