package application.domain.models;

import application.domain.valueobjects.ShipmentStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class Shipment extends CommercialResource {

    private Order order;
    private Warehouse originWarehouse;
    private LocalDateTime dispatchDate;
    private ShipmentStatus shipmentStatus;
}