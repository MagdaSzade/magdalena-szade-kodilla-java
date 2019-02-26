package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CollectionTestSuite {
    static int counter = 0;

    @Before
    public void before() {
        counter += 1;
        System.out.println("Test number " + counter + ": START");
    }

    @After
    public void after() {
        System.out.println("Test number " + counter + ": END");
    }

    @Test
    public void testOddNumberExterminatorEmptyList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        //When
        ArrayList<Integer> oddNumbers = OddNumbersExterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(numbers, oddNumbers);
    }

    @Test
    public void testOddNumberExterminatorNormalList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(8);

        ArrayList<Integer> numbersOdd = new ArrayList<>();
        numbersOdd.add(2);
        numbersOdd.add(4);
        numbersOdd.add(8);

        //When
        ArrayList<Integer> oddNumbers = OddNumbersExterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(numbersOdd, oddNumbers);
    }
}
