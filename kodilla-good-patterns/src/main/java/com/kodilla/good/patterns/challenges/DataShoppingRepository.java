package com.kodilla.good.patterns.challenges;

public class DataShoppingRepository implements ShoppingRepository{

    @Override
    public void saveOrder(Order order) {
        System.out.println("Saving order to database");
    }
}
