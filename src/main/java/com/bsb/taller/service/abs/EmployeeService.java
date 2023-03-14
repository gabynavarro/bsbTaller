package com.bsb.taller.service.abs;

import com.bsb.taller.models.request.EmployeeRequest;
import com.bsb.taller.models.response.EmployeeResponse;

import java.util.List;

public interface EmployeeService {
    EmployeeResponse findByName(String name);
    List<EmployeeResponse> getAll();
    EmployeeResponse add(EmployeeRequest employee);
    EmployeeResponse update(Long id, EmployeeRequest request);
    void delete(Long id);
}
