package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AbstractPizzaOrder implements PizzaOrder {
    private final PizzaOrder pizzaOrder;

    protected AbstractPizzaOrder(PizzaOrder taxiOrder) {
        this.pizzaOrder = taxiOrder;
    }

    @Override
    public BigDecimal getCost() {
        return pizzaOrder.getCost();
    }

    @Override
    public String getDescription() {
        return pizzaOrder.getDescription();
    }
}
