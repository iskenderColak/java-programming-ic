package com.icolak.utilities.generics;

public class Overloading {

    public static void printEach(Integer[] arr) {
        for (Integer each : arr) {
            System.out.print(each + " ");
        }
        System.out.println();
    }

    public static void printEach(Double[] arr) {
        for (Double each : arr) {
            System.out.print(each + " ");
        }
        System.out.println();
    }

    public static void printEach(String [] arr) {
        for (String each : arr) {
            System.out.print(each + " ");
        }
        System.out.println();
    }
}
