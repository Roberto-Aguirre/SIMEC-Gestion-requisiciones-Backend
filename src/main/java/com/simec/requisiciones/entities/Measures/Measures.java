package com.simec.requisiciones.entities.Measures;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class Measures {

    private Long id;
    private String measureUnit;
    private String createdBy;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;

}
