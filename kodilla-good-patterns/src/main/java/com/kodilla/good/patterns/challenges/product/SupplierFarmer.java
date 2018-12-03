package com.kodilla.good.patterns.challenges.product;


import java.util.HashMap;
import java.util.Map;

public class SupplierFarmer implements SupplierRegister {
    final Map<String, Integer> thingsAvialable = new HashMap<>();

    public SupplierFarmer() {
        thingsAvialable.put("Tomato", 5);
        thingsAvialable.put("Potato", 10);
        thingsAvialable.put("Onion", 2);
        thingsAvialable.put("Pepper", 8);

    }
    @Override
    public boolean isItemAvailable(String itemName) {
        return this.thingsAvialable.containsKey(itemName);
    }

    @Override
    public boolean isAmountOfItemAvailable(String itemName, int amount) {
        return this.thingsAvialable.get(itemName) >= amount;
    }

    @Override
    public boolean confirmPayment(PaymentOptions paymentOptions) {
        Cash cash = new Cash();

        if (cash.equals(paymentOptions)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean confirmOrder(Basket basket) {
        return true;
    }
}
