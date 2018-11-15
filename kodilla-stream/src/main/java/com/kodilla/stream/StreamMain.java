package com.kodilla.stream;

import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import  com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FuncionalCalculator;
import com.kodilla.stream.beautifer.PoemBeautifier;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("cokolwiek", (string) -> string = "ABC" + string + "ABC");
        poemBeautifier.beautify("cokolwiek", (string) -> string.toUpperCase());
        poemBeautifier.beautify("cokolwiek", (string) -> string += string.substring(2));
        poemBeautifier.beautify("cokolwiek", (string) -> string.replace("kol", "KOLKOL"));

        Processor processor = new Processor();
        processor.execute(() -> System.out.println("Example"));

        System.out.println("Calculating expressions with lambdas");
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10,5,(a,b) -> a + b);
        expressionExecutor.executeExpression(10,5,(a,b) -> a - b);
        expressionExecutor.executeExpression(10,5,(a,b) -> a * b);
        expressionExecutor.executeExpression(10,5,(a,b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(10,5,FuncionalCalculator::addAToB);
        expressionExecutor.executeExpression(10,5,FuncionalCalculator::subBFromA);
        expressionExecutor.executeExpression(10,5,FuncionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(10,5,FuncionalCalculator::divideAByB);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
