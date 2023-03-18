package com.icolak.day31_inheritance.shape_methodOverriding;

public class TestShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(6);

        System.out.println(square);

        square.draw();

        System.out.println("----------------------------");

        Circle circle = new Circle(3.5);

        System.out.println(circle);
    }
}