package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(8);
        list.add(17);
        list.add(30);
        list.add(29);
        System.out.println("Ascending order:");
        list.forEach(System.out::println);
        Collections.sort(list);
        System.out.println("Sorted List: ");
        list.forEach(element -> System.out.println(element));
        Set<String> set = new HashSet<>();
        set.add("Thansh");
        set.add("Lindesh");
        set.add("Mani");
        set.add("Selvam");
        System.out.println("Unique names:");
        set.forEach(element -> System.out.println(element));
        Map<String, Integer> map = new HashMap<>();
        map.put("Mani", 100);
        map.put("Anup", 100);
        map.put("Thansh", 95);
        map.put("Lindesh", 90);
        System.out.println("Element inside the set:");
        map.forEach((key, value) -> {
            System.out.println("Key: " + key + " , " + "Value: " + value);
        });
    }
}
