package com.simec.requisiciones.dtos.Measures;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class MeasuresDTO {
    private Long id;
    private String measureUnit;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;
}
