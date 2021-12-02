package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public abstract class Supplier {

    public abstract OrderDto process(List<Product> products);

    public void sendConfirmation() {
        System.out.println("Sending confirmation to phone...");
    }

    public void giveDiscount() {
        System.out.println("Your discount is 10%");
    }

    public void giveFreeDelivery() {
        System.out.println("Your delivery is free");
    }
}
