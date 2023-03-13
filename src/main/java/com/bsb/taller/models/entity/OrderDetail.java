package com.bsb.taller.models.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Data @Builder
@Table(name="order_details")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull (message = "the attribute amount cannot be empty or null")
    @Min(1)
    private Integer amount;
    @NotNull
    @DecimalMin("0.0")
    private Double fullTotal;
}
