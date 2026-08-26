package application.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class OrderItem {

    private Order order;
    private Product product;
    private Integer quantity;
    private BigDecimal unitPrice;
}