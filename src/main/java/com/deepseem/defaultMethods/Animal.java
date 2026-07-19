package com.deepseem.defaultMethods;

public interface Animal {
    default void eat() {
        System.out.println("Animal Eating");
    }
}abstract class Bird {

    abstract void fly();
}

class Sparrow extends Bird implements Animal {

    @Override
    void fly() {
        System.out.println("Flying");
    }
}

