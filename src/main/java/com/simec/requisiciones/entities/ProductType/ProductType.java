package com.simec.requisiciones.entities.ProductType;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor

public class ProductType {

    private Long id;
    private String typeName;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;
}
