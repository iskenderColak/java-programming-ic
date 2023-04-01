package com.icolak.day37_exceptions;

import java.io.FileInputStream;

public class ExceptionsIntro {

    public static void main(String[] args) {

        String str = "Java";
/*
        char ch = str.charAt(250); // Once you have an exception,
        // exit method will be executed and remaining code fragments are not ganna be executed.
        // Unchecked exception
        System.out.println(ch);
 */
/*
        Pizza pizza = null;
        pizza.calcCost(); // unchecked exception

*/
        // System.out.println(50/0); Unchecked exception

        System.out.println("Hello world");

        System.out.println("------------------------------");

        // this is not an exception, this is a bug
        int score = 100;
        if(score > 59){
            System.out.println("Your grade is D");
        }else if(score > 70){
            System.out.println("Your grade is C");
        }

        System.out.println("---------------------------------");

        // FileInputStream file = new FileInputStream(""); //Checked Exception, compiler error

        // Thread.sleep(3000); // Checked exception compiler error
    }
}
