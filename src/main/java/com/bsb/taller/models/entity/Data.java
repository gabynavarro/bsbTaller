package com.bsb.taller.models.entity;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@RequiredArgsConstructor
@Table(name = "datas")
@Inheritance(strategy = InheritanceType.JOINED)
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @NotBlank(message = "the attribute firstname cannot be empty or null")
    @Column(name = "first_name")
    protected String firstName;
    @NotBlank(message = "the attribute lastname cannot be empty or null")
    @Column(name = "last_name")
    protected String lastName;
    protected String address;
    @Column(name = "zip_code")
    protected String zipCode;
    @Column(name = "phone", length =15 )
    protected String phone;
    protected String department;
    protected String location;
    protected String number;
    protected String floor;
    @NotBlank(message = "the attribute type cannot be empty or null")
    @Column(name = "type")
    protected String type;
}
