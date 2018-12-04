package com.kodilla.good.patterns.food2door;

import java.util.HashMap;

public class ExtraFoodShop implements Supplier {
    private HashMap<String, Integer> itemList = new HashMap<>();

    public ExtraFoodShop() {
        itemList.put("Chicken", 100);
        itemList.put("Pork", 100);
        itemList.put("Lamb", 100);
        itemList.put("Sheep", 100);
    }

    @Override
    public boolean process(String itemName, int amount) {
        if (itemList.containsKey(itemName)) {
            if (itemList.get(itemName) >= amount && amount < 10) {
                return true;
            }
        }
        return false;
    }
}
