package com.icolak.day19_array;

public class MaxNumber {

    public static void main(String[] args) {

        int[] numbers = {100, 20, 500, 40, -10, 30};
        int max = numbers[0]; // assume that first element is the maximum number
        int prevMax = numbers[0];

        for (int i = 1; i < numbers.length; i++) { // i: 1, 2, 3, 4...
            if (numbers[i] > max) { // compares the element of the array with current maximum number
                prevMax = max;
                max = numbers[i]; // replace the current maximum number
            } else if (numbers[i] > prevMax){
                prevMax = numbers[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("prevMax = " + prevMax);
    }
}