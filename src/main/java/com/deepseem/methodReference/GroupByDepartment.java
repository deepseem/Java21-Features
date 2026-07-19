package com.deepseem.methodReference;

import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDepartment {
    public static void main(String[] args) {

        Map<String, Long> result =
                EmployeeData.getEmployees()
                        .stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.counting()));

        result.forEach((department, count) ->
                System.out.println(department + " -> " + count));
    }
}
