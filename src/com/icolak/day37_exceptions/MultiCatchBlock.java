package com.icolak.day37_exceptions;

import com.icolak.day35_polymorphism.transpotationTask.Car;

public class MultiCatchBlock {

    public static void main(String[] args) {

        System.out.println("Program started");
        Car car = null;
        try {
            car.drive(); // NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("First Catch Block");
            e.printStackTrace();
        } catch (ClassCastException e) {
            System.out.println("Second Catch Block");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Third Catch Block");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Forth Catch Block");
            e.printStackTrace();
        } catch (RuntimeException e) { // Parent exception class can not be placed before child exception class
            System.out.println("Fifth Catch Block");
            e.printStackTrace();
        }
        System.out.println("Program ended");
    }
}
