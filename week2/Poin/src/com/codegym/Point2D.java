package com.codegym;

public class Point2D {
  private float x ;
  private float y ;

  // Viet ham contructor co tham so
  public Point2D(float x, float y){
        this.x = x;
        this.y= y;
  }

  // Ham contructor khong tham so
  // Day la ham mac dinh
  public Point2D(){

  }

    // Lay gia tri cua thuoc tinh x
    // Vi thuoc tinh x dang la private
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    // Day la mot ham dung de cap nhat gia tri x, y
    public void setXY(float x, float y){
      this.x = x;
      this.y = y;

    }

  @Override
  public String toString() {
    return "Point2D{" +
            "x=" + x +
            ", y=" + y +
            '}';
  }
}