package com.deepseem.parallelStreams;

public class StreamVsParallelStream {
    public static void main(String[] args) {

        System.out.println("Sequential:");

        EmployeeData.getEmployees()
                .stream()
                .forEach(e ->
                        System.out.println(
                                Thread.currentThread().getName()
                                        + " -> " + e.getName()));

        System.out.println("\nParallel:");

        EmployeeData.getEmployees()
                .parallelStream()
                .forEach(e ->
                        System.out.println(
                                Thread.currentThread().getName()
                                        + " -> " + e.getName()));
    }
}
