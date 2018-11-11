package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {

    private int side;
    private String name = "Square";

    public Square(int side) {
        this.side = side;
    }

    public String getShapeName() {
        return this.name;
    }

    public double getField(){
        return this.side*this.side;
    }
}
