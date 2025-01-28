package com.example.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer,Integer> square= n->n*n;
        Function<Integer,String> toString=n->"Result" +n;
        Function<Integer,String> combine=square.andThen(toString);
        String result=combine.apply(4);
        System.out.println(result);
        BiFunction<Integer,Integer,Integer> sum=(a, b)->a+b;
        System.out.println(sum.apply(5,5));
    }
}
