package com.deepseem.dateTimeAPI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterPatterns {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        System.out.println(
                date.format(
                        DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println(
                date.format(
                        DateTimeFormatter.ofPattern("MMM dd yyyy")));
    }
}
