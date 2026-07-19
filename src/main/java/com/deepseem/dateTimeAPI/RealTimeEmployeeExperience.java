package com.deepseem.dateTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class RealTimeEmployeeExperience {
    public static void main(String[] args) {

        LocalDate joiningDate =
                LocalDate.of(2019,5,15);

        Period experience =
                Period.between(joiningDate,
                        LocalDate.now());

        System.out.println(
                "Experience : "
                        + experience.getYears()
                        + " Years "
                        + experience.getMonths()
                        + " Months");
    }
}
