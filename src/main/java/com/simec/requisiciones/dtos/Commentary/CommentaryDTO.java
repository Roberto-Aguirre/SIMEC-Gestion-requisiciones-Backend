package com.simec.requisiciones.dtos.Commentary;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Getter
@NoArgsConstructor

@Builder
public class CommentaryDTO {
    private Long id;
    private String comment;
}
