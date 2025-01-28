package com.example.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> colors= Arrays.asList("Green","Blue","Yellow");
        List<String> code=Arrays.asList("G","B","Y");

        Consumer<String> update= color->{
            String newColor=color.substring(0, 1).toUpperCase() ;//+ color.substring(1);
            System.out.println(newColor);
        };
        colors.forEach(update);

        BiConsumer<String,String> color_code=(colour, codes)->{
            System.out.println(colour+""+codes);
        };
        for (int i = 0; i < colors.size(); i++) {
            color_code.accept(colors.get(i),code.get(i) );

        }
    }
}
