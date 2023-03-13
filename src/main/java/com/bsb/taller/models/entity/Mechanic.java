package com.bsb.taller.models.entity;

import lombok.Builder;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@EqualsAndHashCode(callSuper = true)
@Entity
@lombok.Data
@Builder
@Table(name = "mechanics")
@PrimaryKeyJoinColumn(name = "data_id")
public class Mechanic extends Data{
    @NotBlank(message = "the attribute sector cannot be empty or null")
    private String sector;
    @Enumerated(EnumType.STRING)
    private char status;
}
