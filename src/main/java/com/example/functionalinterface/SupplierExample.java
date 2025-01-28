package com.example.functionalinterface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> randomColor=()->{
            Random obj=new Random();
            String[] colors={"Green","Blue","Yellow"};
            return colors[obj.nextInt(colors.length)];

        };
        System.out.println(randomColor.get());
    }
}
