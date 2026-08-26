package application.domain.models;

import application.domain.valueobjects.ParticipantStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Participant extends Person {

    private ParticipantStatus status;
}