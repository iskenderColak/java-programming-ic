package com.icolak.utilities.generics;

import java.util.List;

public class GenericsClass <T>{

    public void printEach(T[] arr) {
        for (T each : arr) {
            System.out.print(each + " ");
        }
        System.out.println();
    }

    public void printEach(List<T> list) {
        for (T each : list) {
            System.out.print(each + " ");
        }
        System.out.println();
    }
}
