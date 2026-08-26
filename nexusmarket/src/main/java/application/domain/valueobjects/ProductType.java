package application.domain.valueobjects;

public final class ProductType extends DomainCatalog {

    public static final ProductType PHYSICAL = new ProductType(
            "PHYSICAL",
            "Physical",
            "Requires inventory management and dispatch.");

    public static final ProductType DIGITAL = new ProductType(
            "DIGITAL",
            "Digital",
            "Delivered immediately after payment.");

    private ProductType(String code, String name, String description) {
        super(code, name, description);
    }
}