package com.deepseem.forEach;

import java.util.stream.IntStream;

public class ForEachIndexExample {
    public static void main(String[] args) {

        IntStream.range(0,5)
                .forEach(System.out::println);
    }
}
