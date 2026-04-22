package com.simec.requisiciones.entities.DetailPurchaseRequisition;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class DetailPurchaseRequisition {
    private Long detailId;
    private Long requisition;
    private Long product;
    private Integer quantity;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;
};
