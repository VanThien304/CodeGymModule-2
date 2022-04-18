package com.company;

public class Main {

    public static void main(String[] args) {
    Calculation cal = new Calculation();
    cal.setX(10);
    cal.setY(25);

        System.out.println("x = " + cal.getX() + "--- y = " + cal.getY());
        System.out.println("x + y = " + cal.sum());
        System.out.println("x - y = " + cal.substract());
    }
}

