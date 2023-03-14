package com.bsb.taller.models.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
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
    @Digits(integer = 17,fraction = 2)
    private Double fullTotal;
    /*  TODO:Relaciones */
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "spare_parts_id")
    private SpareParts spareParts;
}
