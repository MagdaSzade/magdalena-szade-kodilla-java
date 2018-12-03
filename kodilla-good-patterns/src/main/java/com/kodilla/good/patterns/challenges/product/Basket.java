package com.kodilla.good.patterns.challenges.product;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    User user;
    HashMap<String, Integer> basket = new HashMap<>();

    public void addItem(String itemName, int amount) {
        basket.put(itemName,amount);
    }

    public HashMap<String, Integer> getBasket() {
        return this.basket;
    }
}
