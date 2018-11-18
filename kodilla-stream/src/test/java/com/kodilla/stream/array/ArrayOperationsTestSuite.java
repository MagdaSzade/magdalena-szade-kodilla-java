package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] testData = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        double expectedResult = 10.5;
        //When
        double result = ArrayOperation.getAverage(testData);
        //Then
        Assert.assertEquals(expectedResult,result,0.001);
    }
}
