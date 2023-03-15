package com.bsb.taller.service;

import com.bsb.taller.models.entity.Employee;
import com.bsb.taller.models.request.EmployeeRequest;
import com.bsb.taller.models.response.EmployeeResponse;
import com.bsb.taller.service.abs.DataService;
import com.bsb.taller.service.abs.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl extends DataService<Employee> implements EmployeeService {
    @Override
    public EmployeeResponse findByName(String name) {
        return null;
    }

    @Override
    public List<EmployeeResponse> getAll() {
        return null;
    }

    @Override
    public EmployeeResponse add(EmployeeRequest employee) {
        /*Metodo no solicitado, carga por seeder
        * escalabilidad futura
        * */
        return null;
    }

    @Override
    public EmployeeResponse update(Long id, EmployeeRequest request) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
