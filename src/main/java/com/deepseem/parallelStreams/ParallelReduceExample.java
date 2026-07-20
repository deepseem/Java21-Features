package com.deepseem.parallelStreams;

public class ParallelReduceExample {

    public static void main(String[] args) {

        int total = java.util.stream.IntStream
                .rangeClosed(1, 100)
                .parallel()
                .reduce(0, Integer::sum);

        System.out.println(total);
    }
}
