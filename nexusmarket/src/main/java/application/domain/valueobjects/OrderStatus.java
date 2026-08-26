package application.domain.valueobjects;

public final class OrderStatus extends DomainCatalog {

    public static final OrderStatus CART = new OrderStatus(
            "CART",
            "Cart",
            "Provisional selection of products, not yet confirmed.");

    public static final OrderStatus PENDING_PAYMENT = new OrderStatus(
            "PENDING_PAYMENT",
            "Pending Payment",
            "Waiting for financial confirmation.");

    public static final OrderStatus PAID = new OrderStatus(
            "PAID",
            "Paid",
            "Payment confirmed; the preparation process begins.");

    public static final OrderStatus DISPATCHED = new OrderStatus(
            "DISPATCHED",
            "Dispatched",
            "Order has physically left the warehouse.");

    public static final OrderStatus DELIVERED = new OrderStatus(
            "DELIVERED",
            "Delivered",
            "Order has been delivered and the process is finalized.");

    private OrderStatus(String code, String name, String description) {
        super(code, name, description);
    }
}