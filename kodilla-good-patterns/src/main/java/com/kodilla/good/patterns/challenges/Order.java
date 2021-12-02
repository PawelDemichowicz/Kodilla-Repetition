package com.kodilla.good.patterns.challenges;

public class Order {
    public Customer customer;
    public int orderId;
    public String product;

    public Order(Customer customer, int orderId, String product) {
        this.customer = customer;
        this.orderId = orderId;
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getProduct() {
        return product;
    }
}
