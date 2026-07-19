package com.deepseem.dateTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class FindAge {
    public static void main(String[] args) {

        LocalDate dob =
                LocalDate.of(1998,5,20);

        Period age =
                Period.between(dob,
                        LocalDate.now());

        System.out.println(age.getYears());
    }
}
