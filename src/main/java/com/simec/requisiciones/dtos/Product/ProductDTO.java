package com.simec.requisiciones.dtos.Product;

import java.time.LocalDateTime;

import com.simec.requisiciones.entities.Measures.Measures;
import com.simec.requisiciones.entities.ProductType.ProductType;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private Long id;
    private String objectName;
    private String description;
    private String code;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;

    private ProductType productType;
    private Measures measures;

}
