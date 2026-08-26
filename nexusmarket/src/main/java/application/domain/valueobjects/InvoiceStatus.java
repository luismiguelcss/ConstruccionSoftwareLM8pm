package application.domain.valueobjects;

public final class InvoiceStatus extends DomainCatalog {

    public static final InvoiceStatus PENDING = new InvoiceStatus(
            "PENDING",
            "Pending",
            "Invoice issued but not yet paid.");

    public static final InvoiceStatus PAID = new InvoiceStatus(
            "PAID",
            "Paid",
            "Invoice has been fully paid.");

    public static final InvoiceStatus VOIDED = new InvoiceStatus(
            "VOIDED",
            "Voided",
            "Invoice was cancelled and holds no financial effect.");

    private InvoiceStatus(String code, String name, String description) {
        super(code, name, description);
    }
}