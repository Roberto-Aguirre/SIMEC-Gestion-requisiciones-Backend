package com.simec.requisiciones.dtos.RequisitionType;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Getter
@NoArgsConstructor
public class RequisitionTypeDTO {
    private Long id;
    private String typeName;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;
}
