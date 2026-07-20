package com.deepseem.parallelStreams;

public class ParallelForEachOrdered {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .parallelStream()
                .forEachOrdered(System.out::println);
    }
}
