package com.simec.requisiciones.entities.Product;

import java.time.LocalDateTime;

import com.simec.requisiciones.entities.Measures.Measures;
import com.simec.requisiciones.entities.ProductType.ProductType;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor

public class Product {

    private Long id;
    private String objectName;
    private String description;
    private Measures measures;
    private ProductType productType;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;
    
}
