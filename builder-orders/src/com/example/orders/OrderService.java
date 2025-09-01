package com.example.orders;

public class OrderService {
    private final PricingRules pricingRules;

    public OrderService(PricingRules pricingRules) {
        this.pricingRules = pricingRules;
    }

    public Order createOrder(String orderId, String customerName, String shippingAddress) {
        // Use the builder to construct the order
        Order.Builder builder = new Order.Builder(orderId, customerName)
                .shippingAddress(shippingAddress);

        // In a real scenario, you might add default items or perform other logic.
        // For this example, we'll assume items are added before this is called,
        // or that the caller will add them. Let's add a sample item to make it buildable.
        builder.addOrderLine(new OrderLine("Default Item", 1, 10));

        Order order = builder.build();

        // Apply pricing rules (workflow remains)
        applyPricingRules(order);

        return order;
    }

    private void applyPricingRules(Order order) {
        // This logic remains unchanged.
        System.out.println("Applying pricing rules for order: " + order.getOrderId());
    }
}