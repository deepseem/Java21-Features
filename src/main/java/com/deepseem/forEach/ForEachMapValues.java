package com.deepseem.forEach;

import java.util.Map;

public class ForEachMapValues {
    public static void main(String[] args) {

        Map<String,Integer> map =
                Map.of(
                        "Java",8,
                        "Spring",6,
                        "Kafka",4);

        map.forEach((k,v)->
                System.out.println(k+" -> "+v));
    }
}
