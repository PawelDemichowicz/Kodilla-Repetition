package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class OrderDto {

    public List<Product> products;
    public int orderId;
    public double totalPrice;

    public OrderDto(List<Product> products, int orderId, double totalPrice) {
        this.products = products;
        this.orderId = orderId;
        this.totalPrice = totalPrice;
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
