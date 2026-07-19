package com.deepseem.dateTimeAPI;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitExample {
    public static void main(String[] args) {

        long months =
                ChronoUnit.MONTHS.between(
                        LocalDate.of(2020,1,1),
                        LocalDate.now());

        System.out.println(months);
    }
}
