package com.kodilla.good.patterns.food2door;

import java.util.HashMap;

public class OrderProcessor {
    private Supplier supplier;

    public OrderProcessor(final Supplier supplier) {
        this.supplier = supplier;
    }

    public boolean orderFood(String itemName, int amount) {
        return (this.supplier.process(itemName, amount));
    }

}
