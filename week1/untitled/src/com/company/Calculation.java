package com.company;

public class Calculation {

    //biến của lớp
    private int x,y;

    //getter
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    //setters
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    // phương thức tính tổng và hiệu
    public int sum(){
        return  x + y;
    }
    public int substract(){
        return  x - y;
    }
}
