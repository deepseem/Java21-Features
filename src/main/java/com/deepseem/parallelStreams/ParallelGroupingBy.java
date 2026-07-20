package com.deepseem.parallelStreams;

import java.util.stream.Collectors;

public class ParallelGroupingBy {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .parallelStream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((k, v) ->
                        System.out.println(k + " -> " + v));
    }
}
