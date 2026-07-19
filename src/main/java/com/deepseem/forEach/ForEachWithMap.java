package com.deepseem.forEach;

import java.util.HashMap;
import java.util.Map;

public class ForEachWithMap {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(101,"John");
        map.put(102,"David");
        map.put(103,"Alice");

        map.forEach((id,name)->
                System.out.println(id+" : "+name));
    }
}
