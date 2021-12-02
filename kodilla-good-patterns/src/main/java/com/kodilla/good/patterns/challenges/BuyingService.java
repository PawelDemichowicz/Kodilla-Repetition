package com.kodilla.good.patterns.challenges;

public class BuyingService implements ShoppingService {

    @Override
    public boolean confirmOrder(Customer customer, Order order) {
        return true;
    }
}
