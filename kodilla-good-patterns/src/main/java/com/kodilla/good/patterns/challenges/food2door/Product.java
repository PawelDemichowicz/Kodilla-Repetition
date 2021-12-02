package com.kodilla.good.patterns.challenges.food2door;

public class Product {

    private Supplier supplier;
    private String name;
    private String category;
    private double price;
    private double orderedQuantity;
    private double availableQuantity;

    public Product(Supplier supplier, String name, String category, double price,double orderedQuantity, double availableQuantity) {
        this.supplier = supplier;
        this.name = name;
        this.category = category;
        this.price = price;
        this.orderedQuantity = orderedQuantity;
        this.availableQuantity = availableQuantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public double getOrderedQuantity() {
        return orderedQuantity;
    }

    public double getAvailableQuantity() {
        return availableQuantity;
    }
}
