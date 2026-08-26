package application.domain.valueobjects;

public final class ReturnStatus extends DomainCatalog {

    public static final ReturnStatus REQUESTED = new ReturnStatus(
            "REQUESTED",
            "Requested",
            "Return has been requested by the buyer.");

    public static final ReturnStatus APPROVED = new ReturnStatus(
            "APPROVED",
            "Approved",
            "Return has been accepted.");

    public static final ReturnStatus REJECTED = new ReturnStatus(
            "REJECTED",
            "Rejected",
            "Return request has been denied.");

    public static final ReturnStatus REFUNDED = new ReturnStatus(
            "REFUNDED",
            "Refunded",
            "Refund has been completed.");

    private ReturnStatus(String code, String name, String description) {
        super(code, name, description);
    }
}