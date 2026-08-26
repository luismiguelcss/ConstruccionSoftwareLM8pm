package application.domain.valueobjects;

public final class WarehouseOwnerType extends DomainCatalog {

    public static final WarehouseOwnerType MARKETPLACE = new WarehouseOwnerType(
            "MARKETPLACE",
            "Marketplace",
            "Warehouse belongs directly to the Marketplace.");

    public static final WarehouseOwnerType SELLER = new WarehouseOwnerType(
            "SELLER",
            "Seller",
            "Warehouse belongs to a specific Seller.");

    private WarehouseOwnerType(String code, String name, String description) {
        super(code, name, description);
    }
}