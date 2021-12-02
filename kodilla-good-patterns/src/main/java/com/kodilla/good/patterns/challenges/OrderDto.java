package com.kodilla.good.patterns.challenges;

public class OrderDto {
    public Customer customer;
    public boolean isOrder;

    public OrderDto(Customer customer, boolean isOrder) {
        this.customer = customer;
        this.isOrder = isOrder;
    }

    public Customer getCustomer() {
        return customer;
    }

    public boolean isOrder() {
        return isOrder;
    }
}
