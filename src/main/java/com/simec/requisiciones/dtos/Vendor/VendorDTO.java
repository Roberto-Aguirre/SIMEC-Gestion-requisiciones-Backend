package com.simec.requisiciones.dtos.Vendor;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class VendorDTO {
    private Long id;
    private String vendorName;
    private String vendorEmail;
    private String vendorPhone;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;
    
}
