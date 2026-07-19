package com.deepseem.employeeStreamPrograms;

import java.util.Map;
import java.util.stream.Collectors;

public class CountMaleFemaleEmployees {
    public static void main(String[] args) {

        Map<String, Long> result =
                EmployeeData.getEmployees()
                        .stream()
                        .collect(Collectors.groupingBy(
                                Employee::getGender,
                                Collectors.counting()));

        result.forEach((gender, count) ->
                System.out.println(gender + " -> " + count));
    }
}
