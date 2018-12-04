package com.kodilla.good.patterns.food2door;

import java.util.HashMap;

public class HealthyShop implements Supplier {
    private HashMap<String, Integer> itemList = new HashMap<>();

    public HealthyShop() {
        itemList.put("Tomato", 100);
        itemList.put("Potato", 100);
        itemList.put("Onion", 100);
        itemList.put("Pepper", 100);
    }

    @Override
    public boolean process(String itemName, int amount) {
        if (itemList.containsKey(itemName)) {
            if (itemList.get(itemName) >= amount) {
                return true;
            }
        }
        return false;
    }
}
