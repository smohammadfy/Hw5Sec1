package com.company;

import java.util.ArrayList;
import java.util.Objects;
import java.lang.Math;

public class Triangle {
    private ArrayList<Integer> sides = new ArrayList<Integer>();

    public Triangle(int sidOne, int sidTwo, int sidThree) {
        this.sides.add(sidOne);
        this.sides.add(sidTwo);
        this.sides.add(sidThree);
    }

    public ArrayList<Integer> getSides() {
        return sides;
    }

    public boolean isEquilateral() {
        return Objects.equals(sides.get(0), sides.get(1)) && Objects.equals(sides.get(1), sides.get(2));
    }

    public double calculatePerimeter() {
        double p = 0;
        for (Integer side : sides) {
            p += side;
        }
        return p;
    }

    public double calculateArea() {
        double p = 0;
        double a = 0;
        for (Integer side : sides) {
            p += side;
        }
        p = p / 2;
        a = Math.sqrt(p * (p - sides.get(0)) * (p - sides.get(1)) * (p - sides.get(2)));
        return a;
    }

    public void draw() {
        if (isEquilateral()) {
            System.out.println("Sides are Equal");
        } else {
            System.out.println("Sides are not Equal");
        }
        System.out.println("Perimeter is " + calculatePerimeter());
        System.out.println("Area is "+ calculateArea());

    }
    public boolean equals(int sideOne, int sideTwo , int sideThree) {
        return sides.get(0) == sideOne && sides.get(1) == sideTwo && sides.get(2) == sideThree;
    }

    public String toString(){
        String name = "Triangle";
        String sides = " sides are" + getSides();
        return name + sides;
    }
}
