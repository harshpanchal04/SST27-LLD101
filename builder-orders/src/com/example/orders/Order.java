package com.example.orders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {
    private final String orderId;
    private final String customerName;
    private final String shippingAddress;
    private final List<OrderLine> orderLines;

    private Order(Builder builder) {
        this.orderId = builder.orderId;
        this.customerName = builder.customerName;
        this.shippingAddress = builder.shippingAddress;
        this.orderLines = Collections.unmodifiableList(builder.orderLines);
    }

    // Getters
    public String getOrderId() { return orderId; }
    public String getCustomerName() { return customerName; }
    public String getShippingAddress() { return shippingAddress; }
    public List<OrderLine> getOrderLines() { return orderLines; }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", orderLines=" + orderLines.size() +
                '}';
    }

    public static class Builder {
        // Required
        private final String orderId;
        private final String customerName;

        // Optional
        private String shippingAddress;
        private final List<OrderLine> orderLines = new ArrayList<>();

        public Builder(String orderId, String customerName) {
            this.orderId = orderId;
            this.customerName = customerName;
        }

        public Builder shippingAddress(String shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        public Builder addOrderLine(OrderLine line) {
            this.orderLines.add(line);
            return this;
        }

        public Order build() {
            if (orderId == null || customerName == null) {
                throw new IllegalStateException("Order ID and customer name are required.");
            }
            if (orderLines.isEmpty()) {
                throw new IllegalStateException("Order must have at least one order line.");
            }
            return new Order(this);
        }
    }
}