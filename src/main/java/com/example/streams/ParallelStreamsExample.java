package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ParallelStreamsExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        int sum = numbers.parallelStream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum: " + sum);
        List<Integer> number= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        Optional<Integer> max = numbers.parallelStream()
                .max(Integer::compareTo);

        System.out.println("Max Value: " + max.orElse(null));

        List<Integer> numberss = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        List<Integer> evenNumbers = numbers.parallelStream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);

    }
}
