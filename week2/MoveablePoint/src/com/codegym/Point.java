package com.codegym;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    // khởi tạo constructor có tham số x,y
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    //khởi tạo constructor không tham số
    // hàm mặc định
    public Point(){

    }
    //lấy giá trị của thuộc tính x,vì thuộc tính x đang là private
   public float getX(){
        return x;
   }
   public void setX(float x){
        this.x = x;
   }
    public float getY(){
        return y;
    }
    public void setY(float y){
        this.y = y;
    }
    //hàm cập nhật giá trị x,y
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "x = "
                + x
                + ", y = "
                + y;
    }
}
