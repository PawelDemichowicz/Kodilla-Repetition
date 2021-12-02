package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop extends Supplier {

    public final static String HEALTHY_SHOP = "HealthyShop";

    @Override
    public OrderDto process(List<Product> products) {
        System.out.println(HEALTHY_SHOP);
        List<Product> orderedList = new ArrayList<>();
        double totalPrice = 0;
        for (Product product : products) {
            if (product.getOrderedQuantity() > product.getAvailableQuantity()) {
                System.out.println(product.getName() + " is not available in the stated quantity");
                System.out.println("The order could not be completed!");
                return new OrderDto(new ArrayList<>(), 0, 0);
            } else {
                totalPrice += product.getOrderedQuantity() * product.getPrice();
                orderedList.add(product);
            }
        }
        sendConfirmation();
        return new OrderDto(orderedList,2,totalPrice);
    }
}
