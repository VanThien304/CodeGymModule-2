package com.codegym;

public class Circle {
    private String color;
    private double radius;
    private boolean filled;

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = isFilled();
    }
    public double getArea(){
        return  Math.PI * Math.pow(radius,2);
    }
    @Override
    public String toString(){
        return getArea() + " ";
    }
}
