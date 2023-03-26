package com.icolak.utilities.generics;

import java.util.List;

public class GenericsMethod {

    public static<T> void printEach(T[] arr) {
        for (T each : arr) {
            System.out.print(each + " ");
        }
        System.out.println();
    }

    public static <T> void printEach(List<T> list) {
        for (T each : list) {
            System.out.print(each + " ");
        }
        System.out.println();
    }
/*
    public static void printEach(Double[] arr) {
        for (Double each : arr) {
            System.out.println(each);
        }
    }

    public static void printEach(String [] arr) {
        for (String each : arr) {
            System.out.println(each);
        }
    }

 */
}
