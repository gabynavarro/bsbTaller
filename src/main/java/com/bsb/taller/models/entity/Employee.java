package com.bsb.taller.models.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Getter @Setter
@Builder
@Table(name = "employees")
@PrimaryKeyJoinColumn(name = "data_id")
public class Employee extends Data{
    @Column(name = "sector")
    @NotBlank(message = "the attribute sector cannot be empty or null")
    private String sector;

}
