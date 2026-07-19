package com.deepseem.methodReference;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodReference {
    public void print(String value) {
        System.out.println(value);
    }

    public static void main(String[] args) {

        InstanceMethodReference reference =
                new InstanceMethodReference();

        List<String> list =
                Arrays.asList("Java","Spring","Kafka");

        list.forEach(reference::print);
    }
}
