package com.bsb.taller.controllers;

import com.bsb.taller.models.request.EmployeeRequest;
import com.bsb.taller.models.request.MechanicRequest;
import com.bsb.taller.service.abs.EmployeeService;
import com.bsb.taller.service.abs.MechanicService;
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
@Api(value = "Mechanic Controller", tags = "Actions allowed for mechanic")
@RequestMapping(name = "/api/v1/mechanic")
public class MechanicController {
    private final MechanicService service;
   /* @GetMapping("name")
    @ApiOperation(value = "find by name mechanic", notes = "Return mechanic type response" )
    public ResponseEntity<?> getMechanicName(@RequestParam(name = "name", required = false) String name) {
        return ResponseEntity.status( HttpStatus.OK ).body(service.findByName(name));
    }*/

 /*   @GetMapping("/all")
    @ApiOperation(value = "find all mechanics", notes = "Return list mechanics type responses" )
    public ResponseEntity<List<?>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
    }


    @PostMapping()
    @ApiOperation(value = "create new mechanic", notes = "Return a mechanic type response" )
    public ResponseEntity<?> mechaniceAdd(
            @RequestBody MechanicRequest mechanic) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.add(mechanic));
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "find by id and update mechanic", notes = "returns modified mechanic ty response" )
    public ResponseEntity<?> update(
            @RequestBody MechanicRequest mechanic,
            @PathVariable Long id)  {
        return ResponseEntity.status(HttpStatus.OK).body(service.update(id, mechanic));
    }
    @DeleteMapping("/{id}")
    @ApiOperation(value = "find by id and delete employee", notes = "does not return employee or response" )
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }*/
}
