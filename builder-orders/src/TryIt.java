import com.example.orders.Order;
import com.example.orders.OrderLine;
// OrderService and PricingRules are no longer directly used in TryIt
// as the builder is more direct for this demonstration.

public class TryIt {
    public static void main(String[] args) {
        System.out.println("Building orders with the Builder pattern...");

        // The workflow is now to use the builder directly to construct a complete order.
        Order order1 = new Order.Builder("ORD-001", "Harsh Shukla")
                .shippingAddress("123 Builder Lane, Codeville")
                .addOrderLine(new OrderLine("Laptop", 1, 1200))
                .addOrderLine(new OrderLine("Mouse", 1, 25))
                .build();

        System.out.println("Successfully created Order 1: " + order1);
        System.out.println("Items in Order 1: " + order1.getOrderLines().size());

        Order order2 = new Order.Builder("ORD-002", "Jane Developer")
                .shippingAddress("456 Refactor Road, Design Patterns City")
                .addOrderLine(new OrderLine("Keyboard", 1, 75))
                .build();

        System.out.println("Successfully created Order 2: " + order2);
        System.out.println("Items in Order 2: " + order2.getOrderLines().size());

        System.out.println("Done.");
    }
}