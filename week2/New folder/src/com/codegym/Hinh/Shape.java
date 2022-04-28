package com.codegym.Hinh;

// khai báo lớp trừu tượng Shape
abstract class Shape {
    abstract void draw();
}
// Trong trường hợp thực, việc triển khai được cung cấp bởi những người khác,
// tức là người dùng cuối không biết.
class Rectangle extends Shape{
    void draw(){
        System.out.println("Rectangle Drawing");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Cicle Drawing");
    }
}// trong thực tế, phương thức được gọi bới ltv hoặc người dùng.
class TestAbstract{
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

//        Shape rectangle = new Rectangle();
//        rectangle.draw();
    }
}
