package com.deepseem.dateTimeAPI;

import java.time.LocalDate;

public class NextPreviousDay {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(today.plusDays(1));

        System.out.println(today.minusDays(1));
    }
}
