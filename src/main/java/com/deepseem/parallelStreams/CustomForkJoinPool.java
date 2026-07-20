package com.deepseem.parallelStreams;

import java.util.concurrent.ForkJoinPool;

public class CustomForkJoinPool {
    public static void main(String[] args) throws Exception {

        ForkJoinPool pool = new ForkJoinPool(4);

        pool.submit(() ->
                EmployeeData.getEmployees()
                        .parallelStream()
                        .forEach(System.out::println)).get();

        pool.shutdown();
    }
}
