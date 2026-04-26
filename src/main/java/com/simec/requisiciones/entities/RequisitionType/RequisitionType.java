package com.simec.requisiciones.entities.RequisitionType;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor

@Entity(name = "requisition_types")
public class RequisitionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "type_name")
    private String typeName;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "last_modified_at")
    private LocalDateTime lastModifiedAt;

    // @OneToMany(targetEntity = PurchaseRequisition.class, mappedBy = "requisitionType")
    // private List<PurchaseRequisition> purchaseRequisitions;
}
