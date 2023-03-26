package com.icolak.utilities.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5, 6};

        Double[] decimals = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};

        String[] names = {"Java", "Selenium", "SQL", "C++", "Photon"};

        List<Integer> listNumbers = new ArrayList<>(Arrays.asList(numbers));
        List<Double> listDecimals = new ArrayList<>(Arrays.asList(decimals));
        List<String> listNames = new ArrayList<>(Arrays.asList(names));

        System.out.println("*****Overloading*****");
        Overloading.printEach(numbers);
        Overloading.printEach(decimals);
        Overloading.printEach(names);

        System.out.println();
        System.out.println("*****Generics Methods*****");
        GenericsMethod.printEach(numbers);
        GenericsMethod.printEach(decimals);
        GenericsMethod.printEach(names);

        System.out.println();
        System.out.println("----------------------------");
        GenericsMethod.printEach(listNumbers);
        GenericsMethod.printEach(listDecimals);
        GenericsMethod.printEach(listNames);
    }
}
