package com.icolak.day37_exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Program1 started");
        try {
            System.out.println(9 / 0); // Arithmetic exception
            System.out.println("Try block");
        // } catch (ClassCastException e) {  // Class cast exception does not relation with Arithmetic, it can not handle
        } catch (ArithmeticException e) {
            System.out.println("Catch Block");
        }
        System.out.println("Program1 ended");

        System.out.println("-----------------------------------");

        System.out.println("Program2 started");
        String str = null;
        try {
            System.out.println(str.toLowerCase());
            System.out.println("Try block");
        } catch (NullPointerException e) { // we can use parent exception class
                                            // Runtime Exception, Exception, Throwable
            System.out.println("Catch Block");
        }
        System.out.println("Program2 ended");

        System.out.println("-----------------------------------");

        System.out.println("Program3 started");
        try {
            Thread.sleep(5000);
            System.out.println("Try Block");
        } catch (InterruptedException e) {
            System.out.println("Catch Block");
        }
        System.out.println("Program3 ended");
    }
}
