package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {

    private int side;
    private String name = "Triangle";

    public Triangle(int side) {
        this.side = side;
    }

    public String getShapeName() {
        return this.name;
    }

    public double getField(){
        return this.side*this.side*Math.sqrt(3)/4;
    }
}
