package com.icolak.day37_exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        try {
            System.out.println(9 / 0);
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception has been caught");
            e.printStackTrace();
            // System.exit(1); // cancelling the finally block
        } finally { // Always executed after try & catch blocks whether an exception occurs or not,
                    // it is optional, if you want to execute this code fragment regardless of the exception,
                    // then use finally block
            System.out.println("Finally Block");
        }
    }
}