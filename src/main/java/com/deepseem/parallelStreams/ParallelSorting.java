package com.deepseem.parallelStreams;

import java.util.Comparator;

public class ParallelSorting {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .parallelStream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEachOrdered(System.out::println);
    }
}
