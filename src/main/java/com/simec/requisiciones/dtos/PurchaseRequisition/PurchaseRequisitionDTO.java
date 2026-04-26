package com.simec.requisiciones.dtos.PurchaseRequisition;

import java.time.LocalDateTime;
import java.util.List;

import com.simec.requisiciones.entities.Commentary.Commentary;
import com.simec.requisiciones.entities.DetailPurchaseRequisition.DetailPurchaseRequisition;
import com.simec.requisiciones.entities.Project.Project;
import com.simec.requisiciones.entities.RequisitionType.RequisitionType;
import com.simec.requisiciones.entities.Vendor.Vendor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class PurchaseRequisitionDTO {
    private Long id;
    private String description;
    private String status;

    private String createdBy;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;
    
    private RequisitionType requisitionType;
    private Vendor vendor;
    private Project project;
    private List<Commentary> comments;
    private List<DetailPurchaseRequisition> details;
}
