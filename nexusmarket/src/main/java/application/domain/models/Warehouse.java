package application.domain.models;

import application.domain.valueobjects.WarehouseOwnerType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Warehouse extends CommercialResource {

    private WarehouseOwnerType ownerType;
    private Seller ownerSeller;
    private String address;
}