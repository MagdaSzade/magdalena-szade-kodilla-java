package com.kodilla.good.patterns.challenges.product;

public interface SupplierRegister {

    public boolean isItemAvailable(String itemName);

    public boolean isAmountOfItemAvailable(String itemName, int amount);

    public boolean confirmPayment(PaymentOptions paymentOptions);

    public boolean confirmOrder(Basket basket);
}
