package com.codegym;

public class Geometric {
    public String getName() {
        Geometric geoObject = new Geometric();
        return "I am a Geometric object";
    }
    public class Rectangle extends Geometric {
        @Override
        public String getName() {
            return "I am a Rectangle object";
        }

    }
}
