package com.icolak.day11_stringBuilder_Buffer;

public class String_StringBuilder_StringBuffer {

    public static void main(String[] args) {

        String string = "Wooden";
        String modifiedString = string.concat(" Spoon"); // "Wooden Spoon"
        System.out.println(string);
        System.out.println(modifiedString);

        System.out.println("----------------------------");

        StringBuilder stringBuilder = new StringBuilder("Wooden"); // mutable
        stringBuilder.append(" Spoon");                            // not synchronized
        System.out.println(stringBuilder);

        System.out.println("----------------------------");

        StringBuffer stringBuffer = new StringBuffer("Wooden"); // mutable
        stringBuilder.append(" Spoon");                         // synchronized
        System.out.println(stringBuffer);                       // thread-safe
    }
}
