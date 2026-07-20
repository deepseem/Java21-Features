package com.deepseem.parallelStreams;

import java.util.stream.IntStream;

public class ParallelPerformanceComparison {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        IntStream.rangeClosed(1, 10_000_000)
                .parallel()
                .sum();

        long end = System.currentTimeMillis();

        System.out.println("Time : " + (end - start) + " ms");
    }
}
