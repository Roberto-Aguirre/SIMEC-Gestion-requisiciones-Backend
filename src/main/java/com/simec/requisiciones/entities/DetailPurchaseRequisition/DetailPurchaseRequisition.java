package com.simec.requisiciones.entities.DetailPurchaseRequisition;

import java.time.LocalDateTime;

import org.hibernate.validator.constraints.br.CNPJ;

import com.simec.requisiciones.entities.Product.Product;
import com.simec.requisiciones.entities.PurchaseRequisition.PurchaseRequisition;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "detail_purchase_requisitions")
public class DetailPurchaseRequisition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detail_id")
    private Long detailId;
    @Column(name = "quantity")
    private Float quantity;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "last_modified_at")
    private LocalDateTime lastModifiedAt;
    
    @ManyToOne(targetEntity = Product.class)
    private Product product;
    // @ManyToOne(targetEntity = PurchaseRequisition.class)
    // private PurchaseRequisition requisition;
};
