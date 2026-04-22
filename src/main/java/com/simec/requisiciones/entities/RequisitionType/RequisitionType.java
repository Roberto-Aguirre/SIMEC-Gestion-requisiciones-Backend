package com.simec.requisiciones.entities.RequisitionType;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class RequisitionType {
    private Long id;
    private String typeName;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;
}
