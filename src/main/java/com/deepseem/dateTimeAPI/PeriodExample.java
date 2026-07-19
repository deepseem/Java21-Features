package com.deepseem.dateTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {

    public static void main(String[] args) {

        LocalDate birth =
                LocalDate.of(1996,10,5);

        Period period =
                Period.between(birth, LocalDate.now());

        System.out.println(period.getYears());
    }
}
