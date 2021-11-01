package com.company;

public class Main {

    public static void main(String[] args) {
//	Triangle t1 = new Triangle(4,4,4);
//    System.out.println("This is Triangle Method Test! ");
//    System.out.println(t1.getSides());
//    System.out.println(t1.isEquilateral());
//    System.out.println(t1.calculatePerimeter());
//    System.out.println(t1.calculateArea());
//    t1.draw();
//    System.out.println(t1.toString());
//    System.out.println("**************\t\t**************");
//    Circle c1 = new Circle(2);
//    System.out.println("This is Circle Method Test! ");
//    System.out.println(c1.getRadius());
//    System.out.println(c1.calculatePerimeter());
//    System.out.println(c1.calculateArea());
//    c1.draw();
//    System.out.println(c1.toString());
//    System.out.println("**************\t\t**************");
//    Rectangle r1 = new Rectangle(3,3,3,3);
//    System.out.println("This is Rectangle Method Test! ");
//    System.out.println(r1.getSides());
//    System.out.println(r1.isSquare());
//    System.out.println(r1.calculatePerimeter());
//    System.out.println(r1.calculateArea());
//    r1.draw();
//    System.out.println(r1.toString());
//    System.out.println("**************\t\t**************");
    System.out.println("This is Paint Method Test! ");
    Paint p = new Paint();
    p.addTriangle(2,2,2);
    p.addTriangle(4,4,6);
    p.addRectangle(1,4,1,4);
    p.addRectangle(8,5,8,5);
    p.addRectangle(6,6,6,6);
    p.addCircle(19);
    p.addCircle(3);
    p.drawAll();
    System.out.println("********* This is end of drawing *********");
    p.printAll();
    }
}
