package com.bsb.taller.models.entity;

import lombok.Builder;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@lombok.Data
@Entity @Builder
@Table(name = "clients")
@PrimaryKeyJoinColumn(name = "data_id")
public class Client extends Data{
    @NotBlank(message = "the attribute line phone cannot be empty or null")
    @Column(name = "line_phone", length = 15)
    private String linePhone;
    @NotBlank(message = "the attribute email phone cannot be empty or null")
    @Column(name = "email", unique = true)
    @Email(message = "The email exists or contains invalid dataa")
    private String email;
    /* TODO: Relaciones */
    @ManyToMany(mappedBy = "clients")
    private List<Vehicle> vehicles;
}
