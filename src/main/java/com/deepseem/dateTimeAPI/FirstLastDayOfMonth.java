package com.deepseem.dateTimeAPI;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class FirstLastDayOfMonth {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(
                today.with(TemporalAdjusters.firstDayOfMonth()));

        System.out.println(
                today.with(TemporalAdjusters.lastDayOfMonth()));
    }
}
