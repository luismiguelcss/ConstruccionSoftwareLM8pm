package application.domain.valueobjects;

public final class InventoryMovementType extends DomainCatalog {

    public static final InventoryMovementType INBOUND = new InventoryMovementType(
            "INBOUND",
            "Inbound",
            "Entry of new stock into the warehouse.");

    public static final InventoryMovementType RESERVATION = new InventoryMovementType(
            "RESERVATION",
            "Reservation",
            "Stock held for an order that is still in progress.");

    public static final InventoryMovementType SALE_OUTBOUND = new InventoryMovementType(
            "SALE_OUTBOUND",
            "Sale Outbound",
            "Stock removed as a result of a confirmed sale.");

    public static final InventoryMovementType ADJUSTMENT = new InventoryMovementType(
            "ADJUSTMENT",
            "Adjustment",
            "Manual correction of the recorded stock.");

    public static final InventoryMovementType RETURN = new InventoryMovementType(
            "RETURN",
            "Return",
            "Stock reincorporated after a product return.");

    private InventoryMovementType(String code, String name, String description) {
        super(code, name, description);
    }
}