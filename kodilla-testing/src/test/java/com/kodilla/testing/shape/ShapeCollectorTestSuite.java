package com.kodilla.testing.shape;

import com.kodilla.testing.shape.*;
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Assert;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        //When
        collector.addFigure(new Circle(2));
        //Then
        Assert.assertEquals(1, collector.size());
    }

    @Test
    public void testRemoveFigureWhenEmptyList() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        //When
        boolean result = collector.removeFigure(new Circle(2));
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(2);
        Square square = new Square(2);
        collector.addFigure(circle);
        collector.addFigure(triangle);
        collector.addFigure(square);

        ShapeCollector testCollector = new ShapeCollector();
        testCollector.addFigure(circle);
        testCollector.addFigure(square);

        //When
        collector.removeFigure(triangle);
        //Then
        Assert.assertEquals(testCollector, collector);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Triangle triangle = new Triangle(2);
        collector.addFigure(new Circle(2));
        collector.addFigure(triangle);
        collector.addFigure(new Square(2));

        //When
        Shape shape = collector.getFigure(1);
        //Then
        Assert.assertEquals(triangle, shape);
    }
}
