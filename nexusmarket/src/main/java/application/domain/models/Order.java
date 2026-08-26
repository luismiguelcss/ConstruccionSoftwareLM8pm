package application.domain.models;

import application.domain.valueobjects.OrderStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class Order extends CommercialResource {

    private Buyer buyer;
    private LocalDateTime creationDate;
    private OrderStatus orderStatus;
    private BigDecimal totalAmount;
}