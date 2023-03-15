package com.bsb.taller.models.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Getter @Setter
@Table(name = "employees")
@PrimaryKeyJoinColumn(name = "data_id")
@AllArgsConstructor @NoArgsConstructor
public class Employee extends Data{
    @Column(name = "sector")
    @NotBlank(message = "the attribute sector cannot be empty or null")
    private String sector;
    @Builder
    public Employee(Long id,  String firstName, String lastName, String address, String zipCode, String phone, String department, String location, String number, String floor,  String type, String sector) {
        super(id, firstName, lastName, address, zipCode, phone, department, location, number, floor, type);
        this.sector=sector;
    }


}
