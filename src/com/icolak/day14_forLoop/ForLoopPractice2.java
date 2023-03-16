package com.icolak.day14_forLoop;

import java.util.Scanner;

public class ForLoopPractice2 {

    public static void main(String[] args) {

        findMax();
        Scanner input = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
             sum += input.nextInt();
        }
        System.out.println("sum = " + sum);
    }

    public static void findMax() {
        int max = Integer.MIN_VALUE;
        int number = -1;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            number = input.nextInt();
            if (number > max) {
                max = number;
            }
        }
        System.out.println(number);
    }
}
// write a program that can ask the user enter a number for five times,  print the maximum number
// write a program that can ask the user enter a number for five times,  print the minimum number