package com.simec.requisiciones.entities.PurchaseRequisition;

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
import jakarta.persistence.OneToMany;
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
    @Column(name = "description")
    private String description;
    @Column(name = "status")
    private String status;

    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "last_modified_at")
    private LocalDateTime lastModifiedAt;
// Done
    @ManyToOne(targetEntity = RequisitionType.class, fetch = FetchType.LAZY)
    private RequisitionType requisitionType;
// Done
 
    
    @ManyToOne(targetEntity = Vendor.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "vendor_id")
    private Vendor vendor;

    @ManyToOne(targetEntity = Project.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToMany(targetEntity = Commentary.class)
    private List<Commentary> comments;

    @ManyToMany(targetEntity = DetailPurchaseRequisition.class)
    private List<DetailPurchaseRequisition> details;
}
