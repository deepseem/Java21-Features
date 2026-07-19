package com.deepseem.collectors;

import java.util.stream.Collectors;

public class PartitionBySalary {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .stream()
                .collect(Collectors.partitioningBy(
                        e -> e.getSalary()>80000));
    }
}
