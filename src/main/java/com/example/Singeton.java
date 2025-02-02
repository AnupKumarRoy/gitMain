package com.example;

public class Singeton {

    private static Singeton intance = null;

    private Singeton() {
    }

    public static Singeton getInstance() {
        if (intance == null) {
            intance = new Singeton();
            System.out.println("Object is initialised");
            return intance;
        }
        return intance;
    }
}
