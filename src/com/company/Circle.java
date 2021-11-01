package com.company;

import java.lang.Math;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double calculatePerimeter() {
        double p = 0;
        p = 2 * Math.PI * radius;
        return p;
    }

    public double calculateArea() {
        double a = 0;
        a = Math.PI * Math.pow(radius,2);
        return a;
    }

    public void draw() {
        System.out.println("Perimeter is " + calculatePerimeter());
        System.out.println("Area is " + calculateArea());
    }

    public boolean equals(int r) {
        return r == radius;
    }

    public String toString() {
        String name = "Circle";
        String r = " radius are " + getRadius();
        return name + r;
    }
}