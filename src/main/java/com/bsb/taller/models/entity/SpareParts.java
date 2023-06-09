package com.bsb.taller.models.entity;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.Columns;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data @Builder
@Table(name = "spare_parts")
public class SpareParts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "the attribute brand cannot be empty or null")
    private String brand;
    @NotBlank(message = "the attribute model cannot be empty or null")
    private String model;
    @NotBlank(message = "the attribute replacement cannot be empty or null")
    private String replacement;
    @NotNull
    @DecimalMin(value = "0.1", inclusive = false)
    private Double cost;
    /* TODO: Relaciones */
    @OneToMany(mappedBy = "spareParts")
    private List<OrderDetail> orderDetails;
}
