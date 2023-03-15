package com.bsb.taller.repository;

import com.bsb.taller.models.entity.SpareParts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SparePartsRepository extends JpaRepository <SpareParts,Long> {

}
