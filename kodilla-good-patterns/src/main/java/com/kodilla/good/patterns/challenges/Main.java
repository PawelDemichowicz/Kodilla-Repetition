package com.kodilla.good.patterns.challenges;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(new Customer("Jan", "Kowalski", "Somewhere", 1), 1, "Toothbrush");

        ProductOrderService productOrderService = new ProductOrderService(new SmsConfirmation(), new BuyingService(), new DataShoppingRepository());
        productOrderService.process(order);
    }
}
