package com.example.functionalinterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> squares= a->a*a;
        System.out.println(squares.apply(3));
        BinaryOperator<Integer> mul=(a, b)->a*b;
        System.out.println(mul.apply(3,4));
    }
}
