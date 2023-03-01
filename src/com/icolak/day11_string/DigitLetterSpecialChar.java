package com.icolak.day11_string;

import java.util.Scanner;

public class DigitLetterSpecialChar {

    public static void main(String[] args) {

        // System.out.println("".charAt(0));

        String str = new Scanner(System.in).nextLine();

        if (str.length() > 0) {

            char f = str.charAt(0);

            // if(f >= 48 && f <= 57)
            if (f >= '0' && f <= '9') {
                System.out.println("First character is digit");
            } else if (f >= 'a' && f <= 'z') {
                System.out.println("First character is lowercase letter");
            } else if (f >= 'A' && f <= 'Z') {
                System.out.println("First character is uppercase letter");
            } else {
                System.out.println("first character is special character");
            }
/*
            if (Character.isDigit(f)) {
                System.out.println("first character is digit");
            } else if (Character.isLowerCase(f)) {
                System.out.println("First character is lowercase letter");
            } else if (Character.isUpperCase(f)) {
                System.out.println("First character is uppercase letter");
            } else {
                System.out.println("first character is special character");
            }
 */
        } else { // String is empty
            System.out.println("String is empty");
        }


    }
}

/*
3. Create a class named DigitLetterSpecialChar and wirte a program that can ask the user to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character is lowercase letter"
	        - if the word starts with lowercase letters, print "first character is uppercase letter"
	        - if the word starts with special characters, print "first character is special character"


        	HINT: You need to check the ascii table

 */
