package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Rectangle {
    private ArrayList<Integer> sides = new ArrayList<Integer>();

    public Rectangle(int sideone, int sidetwo, int sidethree, int sidefour) {
        this.sides.add(sideone);
        this.sides.add(sidetwo);
        this.sides.add(sidethree);
        this.sides.add(sidefour);
    }

    public ArrayList<Integer> getSides() {
        return sides;
    }

    public boolean isSquare() {
        return Objects.equals(sides.get(0), sides.get(1)) && Objects.equals(sides.get(1), sides.get(2)) && Objects.equals(sides.get(2), sides.get(3));
    }
    public double calculatePerimeter() {
        double p = 0;
        for (Integer side : sides) {
            p += side;
        }
        return p;
    }

    public double calculateArea() {
        double a = 0;
        a = sides.get(0) * sides.get(1);
        return a;
    }

    public void draw() {
        if (isSquare()) {
            System.out.println("This Rectangle is Square");
        } else {
            System.out.println("This shape is a Rectangle");
        }
        System.out.println("Perimeter is " + calculatePerimeter());
        System.out.println("Area is "+ calculateArea());

    }
    public boolean equals(int sideOne, int sideTwo , int sideThree, int sideFour) {
        return sides.get(0) == sideOne && sides.get(1) == sideTwo && sides.get(2) == sideThree && sides.get(3) == sideFour;
    }

    public String toString(){
        String name = "Rectangle";
        String sides = " sides are" + getSides();
        return name + sides;
    }
}
