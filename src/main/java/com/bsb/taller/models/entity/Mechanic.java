package com.bsb.taller.models.entity;

import com.bsb.taller.utils.emuns.StatusMechanic;
import lombok.Builder;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@lombok.Data
@Builder
@Table(name = "mechanics")
@PrimaryKeyJoinColumn(name = "data_id")
public class Mechanic extends Data{
    @NotBlank(message = "the attribute sector cannot be empty or null")
    private String sector;
    @Enumerated(EnumType.ORDINAL)
    private StatusMechanic status;
    /* TODO:Relaciones  */
    @OneToMany(mappedBy = "mechanic")
    private List<Labour> labours;
}
