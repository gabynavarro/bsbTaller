package com.bsb.taller.repository;

import com.bsb.taller.models.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends DataRepository<Employee>{
}
