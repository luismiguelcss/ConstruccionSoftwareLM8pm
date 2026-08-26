package application.domain.valueobjects;

public final class OperationType extends DomainCatalog {

    public static final OperationType SELLER_REGISTRATION = new OperationType(
            "SELLER_REGISTRATION",
            "Seller Registration",
            "Onboarding of a new seller by an Administrator.");

    public static final OperationType WAREHOUSE_REGISTRATION = new OperationType(
            "WAREHOUSE_REGISTRATION",
            "Warehouse Registration",
            "Creation of a new warehouse.");

    public static final OperationType PRODUCT_REGISTRATION = new OperationType(
            "PRODUCT_REGISTRATION",
            "Product Registration",
            "Creation of a new product in the catalog.");

    public static final OperationType INVENTORY_MOVEMENT = new OperationType(
            "INVENTORY_MOVEMENT",
            "Inventory Movement",
            "Any movement applied to an inventory record.");

    public static final OperationType ORDER_CREATION = new OperationType(
            "ORDER_CREATION",
            "Order Creation",
            "Creation of a new order.");

    public static final OperationType ORDER_STATUS_CHANGE = new OperationType(
            "ORDER_STATUS_CHANGE",
            "Order Status Change",
            "Transition of an order to a new lifecycle stage.");

    public static final OperationType INVOICE_ISSUANCE = new OperationType(
            "INVOICE_ISSUANCE",
            "Invoice Issuance",
            "Generation of an invoice for a paid order.");

    public static final OperationType SHIPMENT_DISPATCH = new OperationType(
            "SHIPMENT_DISPATCH",
            "Shipment Dispatch",
            "Dispatch of an order from a warehouse.");

    public static final OperationType RETURN_REQUEST = new OperationType(
            "RETURN_REQUEST",
            "Return Request",
            "Submission of a return request by a buyer.");

    public static final OperationType REFUND_PROCESSED = new OperationType(
            "REFUND_PROCESSED",
            "Refund Processed",
            "Completion of a refund associated with a return.");

    private OperationType(String code, String name, String description) {
        super(code, name, description);
    }
}