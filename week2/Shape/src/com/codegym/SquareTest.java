package com.codegym;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8,"blue",true);
        System.out.println(square);
    }
}
