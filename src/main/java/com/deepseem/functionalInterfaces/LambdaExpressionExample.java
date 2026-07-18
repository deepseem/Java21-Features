package com.deepseem.functionalInterfaces;

public class LambdaExpressionExample {
    public static void main(String[] args) {

        Greeting greeting = name -> System.out.println("Hello " + name);

        greeting.sayHello("Deepak");
    }
}
