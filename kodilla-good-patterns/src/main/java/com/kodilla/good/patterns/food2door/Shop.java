package com.kodilla.good.patterns.food2door;

public class Shop {

    public static void main(String[] args) {
        OrderProcessor healthyOrder = new OrderProcessor(new HealthyShop());
        OrderProcessor extraOrder = new OrderProcessor(new ExtraFoodShop());
        OrderProcessor glutenFreeOrder = new OrderProcessor(new GlutenFreeShop());

        if (healthyOrder.orderFood("Tomato", 5)) {
            System.out.println("Successfully ordered.");
        } else {
            System.out.println("The order could not be processed.");
        }

        if (extraOrder.orderFood("Tomato", 5)) {
            System.out.println("Successfully ordered.");
        } else {
            System.out.println("The order could not be processed.");
        }

        if (glutenFreeOrder.orderFood("Carry", 31)) {
            System.out.println("Successfully ordered.");
        } else {
            System.out.println("The order could not be processed.");
        }

    }
}
