package com.kodilla.good.patterns.challenges.product;

public class ProductOrderService {

    private User user;
    private SupplierRegister supplierRegister;
    private PaymentOptions paymentOptions;
    private Basket basket = new Basket();

    public ProductOrderService(final User user, final SupplierRegister supplierRegister) {
        this.user = user;
        this.supplierRegister = supplierRegister;
    }

    public boolean isItemAvailable(String itemName, int amount) {
        if (this.supplierRegister.isItemAvailable(itemName)) {
            if (this.supplierRegister.isAmountOfItemAvailable(itemName, amount)) {
                basket.addItem(itemName, amount);
            } else {
                System.out.println("There is not enough amount of chosen item");
            }
        } else {
            System.out.println("Item is not available");
        }
        return (this.supplierRegister.isItemAvailable(itemName) && this.supplierRegister.isAmountOfItemAvailable(itemName, amount));
    }

    public boolean setPaymentOptions(final PaymentOptions paymentOptions) {
        if (this.supplierRegister.confirmPayment(paymentOptions)) {
            this.paymentOptions = paymentOptions;
        }
        return this.supplierRegister.confirmPayment(paymentOptions);
    }

    public boolean confirmOrder() {
        return this.supplierRegister.confirmOrder(this.basket);
    }
}
