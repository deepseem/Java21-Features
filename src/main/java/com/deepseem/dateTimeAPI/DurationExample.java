package com.deepseem.dateTimeAPI;

import java.time.Duration;
import java.time.LocalTime;

public class DurationExample {
    public static void main(String[] args) {

        Duration duration =
                Duration.between(
                        LocalTime.of(9,0),
                        LocalTime.of(18,30));

        System.out.println(duration.toHours());
    }
}
