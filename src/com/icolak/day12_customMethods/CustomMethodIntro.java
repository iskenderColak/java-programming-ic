package com.icolak.day12_customMethods;

public class CustomMethodIntro {

    public static void main(String[] args){

        System.out.println("Test started");

        greetings();

        System.out.println("Test Completed");

        System.out.println("-----------------------------");

        displayMessage();

    }

    public static void greetings(){

        System.out.println("Hello Icolak");
        System.out.println("How are you today?");
        System.out.println("Are you ready to learn Java");

    }

    public static void displayMessage(){
        greetings();
        System.out.println("Hello World");
        System.out.println("I love Java");
    }
}