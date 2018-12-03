package com.kodilla.good.patterns.challenges.product;

public class Shop {

    public static void main(String[] args) {
        User user = new User("Aleks");
        SupplierRegister supplier = new SupplierFarmer();

        ProductOrderService order = new ProductOrderService(user, supplier);

        if (order.isItemAvailable("Tomato", 2)) {
            if (order.setPaymentOptions(new Cash())) {
                if (order.confirmOrder()) {
                    System.out.println("Udało Ci sie zamówić");
                }
            }
        }
    }
}
