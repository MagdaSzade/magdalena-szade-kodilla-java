package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 6;
        double b = 3;
        //When
        double c = calculator.add(a, b);
        double d = calculator.sub(a, b);
        double e = calculator.mul(a, b);
        double f = calculator.div(a, b);
        //Then
        Assert.assertEquals(9, c, 0.0001);
        Assert.assertEquals(3, d, 0.0001);
        Assert.assertEquals(18, e, 0.0001);
        Assert.assertEquals(2, f, 0.0001);
    }

}
