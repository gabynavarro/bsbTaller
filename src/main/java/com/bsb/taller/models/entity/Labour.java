package com.bsb.taller.models.entity;

import com.bsb.taller.utils.constants.DateFormatConstants;
import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data @Builder
@Entity
@Table(name="labour")
public class Labour {
    /* TODO: MANO DE OBRA */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "the attribute description cannot be empty or null")
    private String description;
    @NotBlank(message = "the attribute duration hs cannot be empty or null")
    @Column(name = "duration_hs")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE, pattern = DateFormatConstants.DATE_HORA)
    private LocalDate durationHs;
}
