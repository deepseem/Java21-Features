package com.deepseem.collectors;

public class CollectingAndThen {

    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .stream()
                .collect(java.util.stream.Collectors.collectingAndThen(
                        java.util.stream.Collectors.toList(),
                        java.util.Collections::unmodifiableList))
                .forEach(System.out::println);
    }
}
