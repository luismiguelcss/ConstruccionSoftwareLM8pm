package application.domain.valueobjects;

public final class ShipmentStatus extends DomainCatalog {

    public static final ShipmentStatus IN_PREPARATION = new ShipmentStatus(
            "IN_PREPARATION",
            "In Preparation",
            "Order is being packaged at the warehouse.");

    public static final ShipmentStatus DISPATCHED = new ShipmentStatus(
            "DISPATCHED",
            "Dispatched",
            "Shipment has left the warehouse.");

    public static final ShipmentStatus IN_TRANSIT = new ShipmentStatus(
            "IN_TRANSIT",
            "In Transit",
            "Shipment is on its way to the buyer.");

    public static final ShipmentStatus DELIVERED = new ShipmentStatus(
            "DELIVERED",
            "Delivered",
            "Shipment has been delivered to the buyer.");

    private ShipmentStatus(String code, String name, String description) {
        super(code, name, description);
    }
}