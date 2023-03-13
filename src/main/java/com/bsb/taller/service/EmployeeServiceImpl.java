package com.bsb.taller.service;

import com.bsb.taller.models.entity.Employee;
import com.bsb.taller.service.abs.DataService;
import com.bsb.taller.service.abs.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends DataService<Employee> implements EmployeeService {
}
