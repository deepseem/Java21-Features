package com.deepseem.parallelStreams;

public class ParallelMapExample {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .parallelStream()
                .map(Employee::getName)
                .forEach(System.out::println);
    }
}
