package application.domain.models;

import application.domain.valueobjects.OperationType;
import application.domain.valueobjects.SystemRole;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
public class AuditLog {

    private String auditId;
    private OperationType operationType;
    private LocalDateTime operationDate;
    private User performedBy;
    private SystemRole userRole;
    private CommercialResource affectedResource;
    private Map<String, Object> details;
}