package com.simec.requisiciones.entities.PurchaseRequisition;

import java.time.LocalDateTime;
import java.util.List;

import com.simec.requisiciones.entities.Commentary.Commentary;
import com.simec.requisiciones.entities.DetailPurchaseRequisition.DetailPurchaseRequisition;
import com.simec.requisiciones.entities.Project.Project;
import com.simec.requisiciones.entities.RequisitionType.RequisitionType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "purchase_requisitions")
public class PurchaseRequisition {  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "buyers_id")
    private Long buyersId;
    @Column(name = "buyers_id")
    private String description;
    @Column(name = "buyers_id")
    private String status;
    @Column(name = "requisition_type_id")
    private RequisitionType requisitionType;
    @Column(name = "proyect_id")
    private Project proyect;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "last_modified_at")
    private LocalDateTime lastModifiedAt;
    
    private List<Commentary> comments;
    
    private List<DetailPurchaseRequisition> details;
}
