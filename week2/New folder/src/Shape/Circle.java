package Shape;

public class Circle extends  Shape{
    private double radius;

    public Circle(double radius,String color){
        super(color);
        this.radius = radius;
    }

    public double getRadius(){
        return  radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double calArea() {
        return 3.14  * radius * radius;
    }

    @Override
    public double calPerimeter() {
        return 3.14 * 2 * radius;
    }
}
