package com.company;

import java.util.ArrayList;


public class Paint {
    private ArrayList<Triangle> triangles;
    private ArrayList<Circle> circles;
    private ArrayList<Rectangle> rectangles;

    public Paint() {
        triangles = new ArrayList<Triangle>();
        circles = new ArrayList<Circle>();
        rectangles = new ArrayList<Rectangle>();
    }

    public void addTriangle(int a, int b, int c) {
        this.triangles.add(new Triangle(a, b, c));
    }

    public void addCircle(int r) {
        this.circles.add(new Circle(r));
    }

    public void addRectangle(int a, int b, int c, int d) {
        this.rectangles.add(new Rectangle(a, b, c, d));
    }
    public void drawAll() {
        for (Triangle triangle : triangles) {
            triangle.draw();
        }
        for (Circle circle: circles) {
            circle.draw();
        }
        for (Rectangle rectangle: rectangles) {
            rectangle.draw();
        }
    }
    public void printAll() {
        for (Triangle triangle : triangles){
            System.out.println(triangle.toString());
        }
        for (Circle circle : circles){
            System.out.println(circle.toString());
        }
        for (Rectangle rectangle : rectangles){
            System.out.println(rectangle.toString());
        }
    }
}