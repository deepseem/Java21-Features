package com.deepseem.defaultMethods;

public class DefaultMethodWithLambda {
    public static void main(String[] args) {

        Greeting greeting = name ->
                System.out.println("Hello " + name);

        greeting.welcome();
        greeting.sayHello("Deepak");
    }
}
