package application.domain.models;

import application.domain.valueobjects.ReturnStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class Return extends CommercialResource {

    private Order order;
    private String reason;
    private BigDecimal refundedAmount;
    private ReturnStatus returnStatus;
}