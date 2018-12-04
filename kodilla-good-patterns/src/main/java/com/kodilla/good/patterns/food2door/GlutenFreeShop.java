package com.kodilla.good.patterns.food2door;

import java.util.HashMap;

public class GlutenFreeShop implements Supplier {
    private HashMap<String, Integer> itemList = new HashMap<>();

    public GlutenFreeShop() {
        itemList.put("Turmeric", 100);
        itemList.put("Carry", 100);
        itemList.put("Cinnamon", 100);
        itemList.put("Anise", 100);
    }

    @Override
    public boolean process(String itemName, int amount) {
        if (itemList.containsKey(itemName)) {
            if (itemList.get(itemName) >= amount && amount > 30) {
                return true;
            }
        }
        return false;
    }
}
