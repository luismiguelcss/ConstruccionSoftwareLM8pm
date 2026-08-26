package application.domain.valueobjects;

public final class SystemRole extends DomainCatalog {

    public static final SystemRole BUYER = new SystemRole(
            "BUYER",
            "Buyer",
            "Individual who purchases published products.");

    public static final SystemRole SELLER = new SystemRole(
            "SELLER",
            "Seller",
            "Responsible for registering and managing products.");

    public static final SystemRole LOGISTICS_OPERATOR = new SystemRole(
            "LOGISTICS_OPERATOR",
            "Logistics Operator",
            "Responsible for the physical operation of warehouses and dispatches.");

    public static final SystemRole ADMINISTRATOR = new SystemRole(
            "ADMINISTRATOR",
            "Administrator",
            "Responsible for managing sellers and warehouses.");

    public static final SystemRole SUPERVISOR = new SystemRole(
            "SUPERVISOR",
            "Supervisor",
            "Query and operational tracking profile.");

    private SystemRole(String code, String name, String description) {
        super(code, name, description);
    }
}