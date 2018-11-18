package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperation {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);
        OptionalDouble averageOD =  IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average();
        double average = 0;
        if(averageOD.isPresent()) {
            average = averageOD.getAsDouble();
        }
        return average;
    }
}
