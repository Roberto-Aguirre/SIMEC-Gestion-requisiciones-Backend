package com.simec.requisiciones.dtos.Project;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class ProjectDTO {
    private Long id;
    private String projectName;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;
}
