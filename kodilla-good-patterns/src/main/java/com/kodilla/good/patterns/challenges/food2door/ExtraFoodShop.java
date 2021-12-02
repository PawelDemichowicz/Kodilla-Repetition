package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop extends Supplier  {

    public final static String EXTRA_FOOD_SHOP = "ExtraFoodShop";

    @Override
    public OrderDto process(List<Product> products) {
        System.out.println(EXTRA_FOOD_SHOP);
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
        if (totalPrice > 200) {
            giveDiscount();
            giveFreeDelivery();
        }
        sendConfirmation();
        return new OrderDto(orderedList,2,totalPrice);
    }
}
