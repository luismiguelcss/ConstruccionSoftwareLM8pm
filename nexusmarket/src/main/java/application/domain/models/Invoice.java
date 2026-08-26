package application.domain.models;

import application.domain.valueobjects.InvoiceStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class Invoice extends CommercialResource {

    private Order order;
    private LocalDateTime issueDate;
    private BigDecimal totalAmount;
    private InvoiceStatus invoiceStatus;
}