package com.icolak.day39_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(); // Array Based Class ===> get() is faster
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        System.out.println(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
        System.out.println("------------------------------------------------------------");
        LinkedList<Integer> linkedList = new LinkedList<>();
        // Node based class (Doubly linked List) ===> add(), addAll(), remove(), removeAll(), removeIf(), retainAll() are faster
        linkedList.add(50);
        linkedList.add(150);
        linkedList.add(250);
        System.out.println(linkedList);
        linkedList.remove(0);
        System.out.println(linkedList);
        System.out.println(linkedList.get(0));

        System.out.println("------------------------------------------------------------");

        Vector<Integer> vector = new Vector<>();
        vector.add(100);
        vector.add(200);
        vector.add(300);
        System.out.println(vector.get(0));

        System.out.println("------------------------------------------------------------");

        Stack<Integer> stack = new Stack<>();
        stack.add(100);
        stack.add(200);
        stack.add(300);
        System.out.println(stack);

        int lastElement = stack.pop();
        System.out.println(lastElement);
        System.out.println(stack);

        int secondLastElement = stack.pop();
        System.out.println(secondLastElement);
        System.out.println(stack);
    }
}