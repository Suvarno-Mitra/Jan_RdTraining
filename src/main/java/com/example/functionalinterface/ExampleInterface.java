package com.example.functionalinterface;
public interface ExampleInterface {
    int add(int a,int b);
    static int mul(int a ,int b){
        return a*b;
    }
    default void print(){
        System.out.println("Hello ");
    }
    ExampleInterface obj=new ExampleInterface() {
        @Override
        public int add(int a,int b) {
            return a+b;
        }


    };

    ExampleInterface obj1=(a,b)->a+b;
}
