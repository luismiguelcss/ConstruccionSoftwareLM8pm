package application.domain.valueobjects;

public final class ParticipantStatus extends DomainCatalog {

    public static final ParticipantStatus ACTIVE = new ParticipantStatus(
            "ACTIVE",
            "Active",
            "Participant can operate normally within the Marketplace.");

    public static final ParticipantStatus SUSPENDED = new ParticipantStatus(
            "SUSPENDED",
            "Suspended",
            "Participant's commercial activity has been temporarily disabled.");

    private ParticipantStatus(String code, String name, String description) {
        super(code, name, description);
    }
}