package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Objects;

public class ShapeCollector {
    ArrayList<Shape> shapeCollector = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapeCollector.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = shapeCollector.remove(shape);
        return result;
    }

    public Shape getFigure(int i) {
        return shapeCollector.get(i);
    }

    public int size() {
        return this.shapeCollector.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShapeCollector that = (ShapeCollector) o;
        return Objects.equals(shapeCollector, that.shapeCollector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeCollector);
    }
}
