package com.icolak.day37_exceptions;

import com.icolak.day31_inheritance.shape_methodOverriding.Circle;

public class TestPizzaObject {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('S', 2, 3);
        Pizza pizza2 = new Pizza('S', 2, 3);
        System.out.println(pizza1 == pizza2);
        System.out.println(pizza1.equals(pizza2));

        Object obj = new Pizza('S', 4, 3); //upcasting
        boolean r = obj.equals(pizza2);
        System.out.println(r);
        double total = ((Pizza) obj).calcCost();
        System.out.println(total);

        // double area = ((Circle)obj).area(); // Class cast exception no relation between Circle and Pizza

        System.out.println("Test Completed");
    }
}