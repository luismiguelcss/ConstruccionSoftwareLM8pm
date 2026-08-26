package application.domain.models;

import application.domain.valueobjects.ProductStatus;
import application.domain.valueobjects.ProductType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Product extends CommercialResource {

    private Seller seller;
    private String name;
    private String description;
    private BigDecimal price;
    private ProductType productType;
    private List<String> variants = new ArrayList<>();
    private ProductStatus productStatus;
}