package com.icolak.utilities.generics;

public class Test {

    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5, 6};

        Double[] decimals = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};

        String[] names = {"Java", "Selenium", "SQL", "C++", "Photon"};

        System.out.println("*****Overloading*****");
        Overloading.printEach(numbers);
        Overloading.printEach(decimals);
        Overloading.printEach(names);
    }
}
