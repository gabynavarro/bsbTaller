package com.bsb.taller.controllers;

import com.bsb.taller.models.request.VehicleRequest;
import com.bsb.taller.service.abs.VehicleService;
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
@Api(value = "Vehicle Controller", tags = "Actions allowed for vehicle")
@RequestMapping(name = "/api/v1/vehicle")
public class VehicleController {
    private final VehicleService service;
    @GetMapping("name")
    @ApiOperation(value = "find by name vehicle", notes = "Return vehicle type response" )
    public ResponseEntity<?> getVehiclePatent(@RequestParam(name = "patent", required = false) String patent) {
        return ResponseEntity.status( HttpStatus.OK ).body(service.findByPatent(patent));
    }

    @GetMapping
    @ApiOperation(value = "find all vehicles", notes = "Return list vehicles type responses" )
    public ResponseEntity<List<?>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
    }


    @PostMapping()
    @ApiOperation(value = "create new vehicle", notes = "Return a vehicle type response" )
    public ResponseEntity<?> clientAdd(
            @RequestBody VehicleRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.add(request));
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "find by id and update vehicle", notes = "returns modified vehicle ty response" )
    public ResponseEntity<?> update(
            @RequestBody VehicleRequest request,
            @PathVariable Long id)  {
        return ResponseEntity.status(HttpStatus.OK).body(service.update(id, request));
    }

}
