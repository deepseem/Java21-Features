package com.deepseem.dateTimeAPI;

import java.time.LocalDate;

public class ParseDate {

    public static void main(String[] args) {

        LocalDate date = LocalDate.parse("2026-07-19");

        System.out.println(date);
    }
}
