package com.example.streams;

import java.util.*;
import java.util.stream.*;

public class OptionalExample {

    public static void main(String[] args) {
        List<String> lists = Arrays.asList("hello", "hi", "hey", null, "java");
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 4, 4, 5);

        // 1. Optional.ofNullable() to wrap nullable value safely
        Optional<String> firstLongWord = lists.stream()
                .filter(word -> word != null && word.length() > 3)
                .findFirst();


        firstLongWord.ifPresent(word -> System.out.println("First long word: " + word));


        String firstWordOrDefault = Optional.ofNullable(lists.get(3)) // index 3 is null
                .orElse("default");
        System.out.println("Word at index 3 or default: " + firstWordOrDefault);


        Optional<String> transformedWord = firstLongWord.map(String::toUpperCase);
        transformedWord.ifPresent(word -> System.out.println("Transformed word: " + word));


        String valueOrDefault = Optional.ofNullable(lists.get(10)) // Index out of bounds
                .orElseGet(() -> "default from supplier");
        System.out.println("Value at index 10 or default: " + valueOrDefault);

        // 6. orElseThrow() - Throws an exception if value is absent
        try {
            String wordAtIndex4 = Optional.ofNullable(lists.get(4))
                    .orElseThrow(() -> new NoSuchElementException("No element found at index 4"));
            System.out.println("Word at index 4: " + wordAtIndex4);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }

        // 7. filter() to filter value based on a condition
        Optional<String> filteredWord = firstLongWord.filter(word -> word.length() > 4);
        filteredWord.ifPresent(word -> System.out.println("Filtered word (length > 4): " + word));

        // 8. ifPresentOrElse() - Execute action if present, or a fallback if not
        firstLongWord.ifPresentOrElse(
                word -> System.out.println("Found word: " + word),
                () -> System.out.println("No word found"));

        // 9. flatMap() to avoid nested Optionals
        Optional<String> flatMappedWord = firstLongWord.flatMap(word -> Optional.of(word.toUpperCase()));
        flatMappedWord.ifPresent(word -> System.out.println("FlatMapped word: " + word));

        // 10. isPresent() and get() - Checks if value is present and retrieves it
        if (firstLongWord.isPresent()) {
            System.out.println("Word found: " + firstLongWord.get());
        } else {
            System.out.println("No word found.");
        }

        // 11. stream() - Converts Optional into a Stream
        List<String> wordsFromOptional = firstLongWord.stream()
                .collect(Collectors.toList());
        System.out.println("Words from Optional: " + wordsFromOptional);

        // 12. Using Optional with reduce() to sum values
        double sum = decimalList.stream()
                .filter(Objects::nonNull)
                .map(Optional::ofNullable) // Wrap values into Optional
                .map(opt -> opt.orElse(0.0)) // Replace null with 0.0
                .reduce(0.0, Double::sum);
        System.out.println("Sum of decimal list: " + sum);

        // 13. Using Optional to handle absent values in stream processing
        Optional<Integer> firstGreaterThan10 = numbers.stream()
                .filter(num -> num > 10)
                .findFirst();

        firstGreaterThan10.ifPresentOrElse(
                num -> System.out.println("First number greater than 10: " + num),
                () -> System.out.println("No number greater than 10"));

        // 14. Optional.empty() to represent an absent value
        Optional<String> emptyOptional = Optional.empty();
        emptyOptional.ifPresentOrElse(
                word -> System.out.println("This will not print."),
                () -> System.out.println("The Optional is empty"));

        // 15. Checking for a non-null value inside an Optional
        Optional<String> nonNullValue = Optional.ofNullable(lists.get(0)); // "hello"
        if (nonNullValue.isPresent()) {
            System.out.println("Non-null value: " + nonNullValue.get());
        } else {
            System.out.println("Value is null.");
        }
    }
}

