package com.codegym;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.0, "yellow", false);
        shapes[1] = new Rectangle( 2.0, 2.0, "infinity", true);
        shapes[2] = new Square(2.0,"melinda",true);
        for (Shape a : shapes){
            System.out.println(a);
        }

        for (Shape a : shapes) {
            a.resize(Math.random() * 1000);
        }
        System.out.println("\n");
        Shape.printShape(shapes);
    }
}
