package com.codegym;

public class Square extends  Shape implements Colorable{
    private double side = 0;

    public Square(){}

    public Square(double side){
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        setShape(color,filled);
        this.side = side;
    }
    public void setSide(double side){
        this.side = side;
    }
    public double getSide(){
        return this.side;
    }
    @Override
    public String toString(){
        return "A Square with side = "
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void howToColor(){
        System.out.println("Square:  paint 4 sides ");
    }
}
