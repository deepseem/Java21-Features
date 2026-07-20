package com.deepseem.parallelStreams;

import java.util.stream.LongStream;

public class ParallelSumExample {
    public static void main(String[] args) {

        long sum = LongStream
                .rangeClosed(1, 1_000_000)
                .parallel()
                .sum();

        System.out.println(sum);
    }
}
