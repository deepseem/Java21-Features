package com.deepseem.lambdaExpressions;

public class RunnableLambdaExample {
    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("Thread is running...");
            System.out.println(Thread.currentThread().getName());
        };

        Thread thread = new Thread(task);
        thread.start();
    }
}
