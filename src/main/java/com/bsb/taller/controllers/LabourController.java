package com.bsb.taller.controllers;

import com.bsb.taller.models.entity.Labour;
import com.bsb.taller.models.request.LabourRequest;
import com.bsb.taller.models.request.OrderRequest;
import com.bsb.taller.service.abs.LabourService;
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
@Api(value = "Labour Controller", tags = "Actions allowed for labour")
@RequestMapping(name = "/api/v1/labour")
public class LabourController {
  /*  private final LabourService service;
    @GetMapping
    @ApiOperation(value = "find all labours", notes = "Return list labours type responses" )
    public ResponseEntity<List<?>> labourAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
    }


    @PostMapping
    @ApiOperation(value = "create new labour", notes = "Return a labour type response" )
    public ResponseEntity<?> labourAdd(
            @RequestBody LabourRequest labour) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.add(labour));
    }

    @PutMapping("{id}")
    @ApiOperation(value = "find by id and update labour", notes = "returns modified labour ty response" )
    public ResponseEntity<?> labourUpdate(
            @RequestBody LabourRequest request,
            @PathVariable Long id)  {
        return ResponseEntity.status(HttpStatus.OK).body(service.update(id, request));
    }*/

}
