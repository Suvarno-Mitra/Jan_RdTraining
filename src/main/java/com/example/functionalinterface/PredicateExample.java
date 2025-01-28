package com.example.functionalinterface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {


        Predicate<Integer> isPrime = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }

            }
            return true;
        };
        System.out.println(isPrime.test(7));
    }
}
