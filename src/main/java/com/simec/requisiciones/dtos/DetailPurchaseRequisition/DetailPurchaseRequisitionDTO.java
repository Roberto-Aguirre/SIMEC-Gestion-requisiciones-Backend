package com.simec.requisiciones.dtos.DetailPurchaseRequisition;

import java.time.LocalDateTime;


import com.simec.requisiciones.entities.Product.Product;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class DetailPurchaseRequisitionDTO {
    private Long detailId;
    private Float quantity;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;
    private Product product_id;
    // private PurchaseRequisition requisition;
};
