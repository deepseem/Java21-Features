package com.deepseem.parallelStreams;

public class BasicParallelStream {
    public static void main(String[] args) {

        EmployeeData.getEmployees()
                .parallelStream()
                .forEach(System.out::println);
    }
}
