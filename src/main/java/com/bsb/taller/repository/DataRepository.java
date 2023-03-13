package com.bsb.taller.repository;

import com.bsb.taller.models.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface DataRepository <T extends Data> extends JpaRepository<T, Long> {
}
