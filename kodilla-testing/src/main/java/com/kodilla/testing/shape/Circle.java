package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    private int radius;
    private String name = "Circle";

    public Circle(int radius) {
        this.radius = radius;
    }

    public String getShapeName() {
        return this.name;
    }

    public double getField(){
        return this.radius*this.radius*Math.PI;
    }
}
