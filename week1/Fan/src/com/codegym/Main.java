package com.codegym;

public class Main {

    public static void main(String[] args) {
	Fan fan1 = new Fan(3,true,"Yellow",10);
    Fan fan2 = new Fan(2,false,"Blue",5);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        System.out.println("Fan1 color is: " + fan1.getColor());
    }
}
