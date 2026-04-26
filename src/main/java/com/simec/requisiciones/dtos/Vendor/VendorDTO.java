package com.simec.requisiciones.dtos.Vendor;

import java.time.LocalDateTime;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class VendorDTO {
    private Long id;
    private String vendorName;
    private String vendorEmail;
    private String vendorPhone;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;
    
}
