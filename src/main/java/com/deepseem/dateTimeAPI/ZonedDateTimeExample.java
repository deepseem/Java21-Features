package com.deepseem.dateTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {
    public static void main(String[] args) {

        ZonedDateTime india =
                ZonedDateTime.now(
                        ZoneId.of("Asia/Kolkata"));

        System.out.println(india);
    }
}
