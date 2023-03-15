package com.bsb.taller.models.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "clients")
@AllArgsConstructor
@NoArgsConstructor
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
    @Builder
    public Client(Long id, String firstName,  String lastName, String address, String zipCode, String phone, String department, String location, String number, String floor,  String type, String linePhone, String email, List<Vehicle> vehicle) {
        super(id, firstName, lastName, address, zipCode, phone, department, location, number, floor, type);
        this.linePhone=linePhone;
        this.email=email;
        this.vehicles=vehicle;
    }
}
