package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private ShoppingService shoppingService;
    private ShoppingRepository shoppingRepository;

    public ProductOrderService(final InformationService informationService, final ShoppingService shoppingService, final ShoppingRepository shoppingRepository) {
        this.informationService = informationService;
        this.shoppingService = shoppingService;
        this.shoppingRepository = shoppingRepository;
    }

    public OrderDto process(final Order order) {
        boolean isOrder = shoppingService.confirmOrder(order.getCustomer(), order);

        if (isOrder) {
            informationService.sendConfirmation(order.customer);
            shoppingRepository.saveOrder(order);
            return new OrderDto(order.customer, true);
        } else {
            return new OrderDto(order.getCustomer(), false);
        }

    }


}
