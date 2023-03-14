package com.bsb.taller.models.entity;

import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data @Builder
@Table(name = "vehicles")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @NotNull
    @Length(min = 1980)
    private Integer year;
    @NotBlank(message = "the attribute color cannot be empty or null")
    private String color;
    @NotBlank(message = "the attribute marca cannot be empty or null")
    private String marca;
    @NotBlank(message = "the attribute replacement cannot be empty or null")
    @Column(name = "vehicle_model")
    private String vehicleModel;
    @NotBlank(message = "the attribute replacement cannot be empty or null")
    @Column(name = "patent", unique = true)
    private String patent;
    /* TODO: Relaciones */
    @ManyToMany
    private List<Client> clients;
}
