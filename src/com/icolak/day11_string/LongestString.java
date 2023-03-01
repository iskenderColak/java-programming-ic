package com.icolak.day11_string;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the string");
        String str1 = input.nextLine();

        System.out.println("Enter the string");
        String str2 = input.nextLine();

        input.close();

        if (str1.length() > str2.length()) {
            System.out.println(str1);
        } else if (str1.length() < str2.length()){
            System.out.println(str2);
        } else {
            System.out.println("Equal");
        }
    }
}
/*
1. Create a class named LongestString
			1.1 Ask the user to enter two strings
			1.2 Write a program that can print the longest string,
			        if both have the same number of characters then print "Equal"
 */
