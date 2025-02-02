package com.example;

public class ArrayManipulation {

    public static void main(String[] args) {

        int[] arr = {3, 6, 1, 8, 12, 8, 9, 10, 7, 2};
        int smallest = arr[0];
        int largest = arr[0];
        int total = 0;
        int size = arr.length;
        System.out.println("Reverse order:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(arr[i]);
            total = total + arr[i];
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
        System.out.println("Total sum: " + total);
        System.out.println("Averge: " + (total / size));
    }

}
