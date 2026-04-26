package com.simec.requisiciones.entities.Vendor;

import java.time.LocalDateTime;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "vendors")
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "vendor_name")
    private String vendorName;
    @Column(name = "vendor_email")
    private String vendorEmail;
    @Column(name = "vendor_phone")
    private String vendorPhone;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "last_modified_at")
    private LocalDateTime lastModifiedAt;

    // @OneToMany(targetEntity = PurchaseRequisition.class, mappedBy = "vendor")
    // private List<PurchaseRequisition> purchaseRequisitions;
}
