package application.domain.models;

import application.domain.valueobjects.InventoryMovementType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class InventoryMovement {

    private Inventory inventory;

    private InventoryMovementType movementType;

    private Integer quantity;

    private LocalDateTime movementDate;

    private String description;
}