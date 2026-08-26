package application.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Inventory extends CommercialResource {

    private Product product;
    private Warehouse warehouse;
    private Integer availableQuantity;
    private Integer reservedQuantity;
}