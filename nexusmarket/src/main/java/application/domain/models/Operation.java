package application.domain.models;

import application.domain.valueobjects.OperationType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class Operation {

    private Integer operationId;
    private OperationType operationType;
    private LocalDateTime executionDate;
    private User performedBy;
    private CommercialResource affectedResource;
}