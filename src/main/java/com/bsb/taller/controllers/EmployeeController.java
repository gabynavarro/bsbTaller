package com.bsb.taller.controllers;

import com.bsb.taller.models.request.EmployeeRequest;
import com.bsb.taller.service.abs.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Log4j2
@Api(value = "Employee Controller", tags = "Actions allowed for employees")
@RequestMapping(name = "/api/v1/employee")
public class EmployeeController {
    private final EmployeeService service;
    @GetMapping("name")
    @ApiOperation(value = "find by name employee", notes = "Return employee type response" )
    public ResponseEntity<?> getEmployeeName(@RequestParam(name = "name", required = false) String name) {
        return ResponseEntity.status( HttpStatus.OK ).body(service.findByName(name));
    }

    @GetMapping
    @ApiOperation(value = "find all employee", notes = "Return list employees type responses" )
    public ResponseEntity<List<?>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
    }


    @PostMapping()
    @ApiOperation(value = "create new employee", notes = "Return a employee type response" )
    public ResponseEntity<?> employeeAdd(
            @RequestBody EmployeeRequest employee) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.add(employee));
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "find by id and update employee", notes = "returns modified employee ty response" )
    public ResponseEntity<?> update(
            @RequestBody EmployeeRequest employee,
            @PathVariable Long id)  {
        return ResponseEntity.status(HttpStatus.OK).body(service.update(id, employee));
    }
    @DeleteMapping("/{id}")
    @ApiOperation(value = "find by id and delete employee", notes = "does not return employee or response" )
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
