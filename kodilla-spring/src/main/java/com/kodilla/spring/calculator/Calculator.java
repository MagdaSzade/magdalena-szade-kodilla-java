package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    Display display;

    public void add(double a, double b) {
        double c = a+b;
        display.displayValue(c);
    }

    public void sub(double a, double b) {
        double c = a-b;
        display.displayValue(c);
    }

    public void mul(double a, double b) {
        double c = a*b;
        display.displayValue(c);
    }

    public void div(double a, double b) {
        double c = a/b;
        display.displayValue(c);
    }
}
