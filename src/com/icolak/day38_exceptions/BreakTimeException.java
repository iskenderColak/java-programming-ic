package com.icolak.day38_exceptions;

public class BreakTimeException extends RuntimeException {

    public BreakTimeException() {
        super("It's break time"); // parent class constructor;
    }
    public BreakTimeException(String message) {
        super(message); // parent class constructor;
    }
}
