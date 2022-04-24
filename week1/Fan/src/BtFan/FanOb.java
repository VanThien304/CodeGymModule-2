package BtFan;

import sun.font.TrueTypeFont;

public class FanOb {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public FanOb(int speed, boolean on, String color, double radius) {
        this.speed = speed;
        this.color = color;
        this.on = on;
        this.radius = radius;

    }

    public String toString() {
        String state = "";
        if (this.isOn()) {
            state += "Fan is on \n";
            state += "Speed: " + this.speed + "\n";
        } else {
            state += "Fan is off \n";
        }
        state += ("Color :" + this.color + "\n");
        state += ("Radius: " + this.radius + "\n");
        return state;
    }

    public static void main(String[] args) {
        FanOb fan1 = new FanOb(3,true,"Blue",10);
        FanOb fan2 = new FanOb(2,false,"Red",5);
        FanOb fan3 = new FanOb(5, true,"Yellow",7);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        System.out.println(fan3.toString());
    }
}
