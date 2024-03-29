package com.icolak.day31_inheritance.vehicleTask;

public class Boat extends Vehicle {
    public Boat(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void sail() {
        System.out.println(getBrand() + " " + getModel() + " is sailing");
    }
}

/*
4. Create a subclass of Vehicle named Boat
			Extra methods:
				sail()
 */