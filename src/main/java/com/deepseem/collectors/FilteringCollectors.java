package com.deepseem.collectors;

import java.util.stream.Collectors;

public class FilteringCollectors {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .stream()
                .collect(Collectors.filtering(
                        e->e.getSalary()>80000,
                        Collectors.toList()));
    }
}
