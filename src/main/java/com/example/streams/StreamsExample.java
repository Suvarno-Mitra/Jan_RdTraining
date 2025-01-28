package com.example.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        List<String> lists= Arrays.asList("hello","hi","hey");
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4,4,4, 5);
        List<String> upperCaseWords = lists.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        decimalList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        decimalList.stream()
                .filter(i->i%5==0)
                .forEach(System.out::println);
        int sum=numbers.stream()
                .reduce(0, Integer::sum);
        List<String> upper=lists.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        List<Integer> distinct=numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        List<Integer> Numbers=numbers.stream()
                .limit(5)
                .collect(Collectors.toList());
        List<Integer> skippedNumbers=numbers.stream()
                .skip(5)
                .collect(Collectors.toList());
        boolean anymatch=numbers.stream()
                .anyMatch(n -> n > 4);

        boolean allMatch=numbers.stream()
                .allMatch(n -> n > 0);
        long count = numbers.stream().count();
        int sum1 = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        List<String> result = lists.stream()
                .filter(word -> word.length() > 5)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        List<String> uniqueStrngs = lists.stream()
                .distinct()
                .collect(Collectors.toList());
        numbers.stream().
                sorted().limit(3).forEach(System.out::println);





    }
}
