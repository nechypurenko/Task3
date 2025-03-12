package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

    public static Map<String, Integer> countDuplicates(List<String> strings) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String str : strings) {
            if (countMap.containsKey(str)) {
                countMap.put(str, countMap.get(str) + 1);
            } else {
                countMap.put(str, 1);
            }
        }

        Map<String, Integer> duplicates = new HashMap<>();
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.put(entry.getKey(), entry.getValue());
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        List<String> strings = List.of("dog", "cat", "bird", "dog", "cat", "elephant", "dog");
        Map<String, Integer> duplicates = countDuplicates(strings);
        System.out.println(duplicates);
    }
}