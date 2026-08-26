package application.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Inventory extends CommercialResource {

    private Product product;

    private Warehouse warehouse;

    private Integer availableQuantity;

    private Integer reservedQuantity;

    private List<InventoryMovement> movements = new ArrayList<>();
}