package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        products.add(new Product(extraFoodShop, "Chia", "seeds", 10, 5, 3));
        extraFoodShop.process(products);
    }
}
