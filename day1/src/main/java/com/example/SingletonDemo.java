package com.example;

public class SingletonDemo {

    public static void main(String[] args) {
        Singeton inst = Singeton.getInstance();
        System.out.println(inst);
        Singeton inst1 = Singeton.getInstance();
        System.out.println(inst1);
    }

}
