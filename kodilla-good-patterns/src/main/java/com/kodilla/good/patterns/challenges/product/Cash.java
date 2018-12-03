package com.kodilla.good.patterns.challenges.product;

import java.util.Objects;

public class Cash implements PaymentOptions {
    String name = "Cash";

    @Override
    public PaymentOptions selectPaymentMethod() {
        return new Cash();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cash cash = (Cash) o;
        return Objects.equals(name, cash.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
