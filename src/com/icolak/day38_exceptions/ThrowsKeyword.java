package com.icolak.day38_exceptions;

public class ThrowsKeyword { // advantages

    // public static void main(String[] args) throws ArithmeticException{ // for only checked exceptions
                                                                            // we can use throws keyword
    public static void main(String[] args) throws InterruptedException{
    // for three programs instead of using three try/catch block,
        // we use throws keyword in method signature. It is faster and the code is clean
        /*
        System.out.println("Program1 started");

       // System.out.println(100/0);
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Program1 ended");

        System.out.println("-------------------------------------------");

        System.out.println("Program2 started");

        // System.out.println(100/0);
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Program2 ended");
        */

        System.out.println("Program1 started");

        Thread.sleep(5000);

        System.out.println("Program1 ended");

        System.out.println("--------------------------------------");

        System.out.println("Program2 started");

        Thread.sleep(5000);

        System.out.println("Program2 ended");


        System.out.println("--------------------------------------");

        System.out.println("Program3 started");

        //FileInputStream file = new FileInputStream("");
        Thread.sleep(5000);

        System.out.println("Program3 ended");
    }
}
