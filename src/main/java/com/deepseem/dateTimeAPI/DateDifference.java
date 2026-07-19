package com.deepseem.dateTimeAPI;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDifference {

    public static void main(String[] args) {

        LocalDate joining = LocalDate.of(2020,1,1);

        LocalDate today = LocalDate.now();

        long days =
                ChronoUnit.DAYS.between(joining,today);

        System.out.println(days);
    }
}
