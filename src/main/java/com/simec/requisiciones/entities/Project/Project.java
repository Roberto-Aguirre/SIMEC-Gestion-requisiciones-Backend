package com.simec.requisiciones.entities.Project;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class Project {
    

    private Long id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;
}
