package com.deepseem.lambdaExpressions;

import java.util.concurrent.*;

public class CallableLambdaExample {
    public static void main(String[] args)
            throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {

            int sum = 0;

            for (int i = 1; i <= 10; i++) {
                sum += i;
            }

            return sum;
        };

        Future<Integer> future = executor.submit(task);

        System.out.println("Result = " + future.get());

        executor.shutdown();
    }
}
