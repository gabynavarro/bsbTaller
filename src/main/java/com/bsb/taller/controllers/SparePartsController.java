package com.bsb.taller.controllers;

import com.bsb.taller.models.request.SparePartsRequest;
import com.bsb.taller.service.abs.SparePartsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Api(value = "Spare parts Controller", tags = "Actions allowed for spare parts")
@RequestMapping(name = "/api/v1/spareparts")
public class SparePartsController {
   /* private final SparePartsService service;
    @GetMapping("name")
    @ApiOperation(value = "find by name parts", notes = "Return spare parts type response" )
    public ResponseEntity<?> getName(@RequestParam(name = "name", required = false) String name) {
        return ResponseEntity.status( HttpStatus.OK ).body(service.findByName(name));
    }

    @GetMapping
    @ApiOperation(value = "find all spare parts", notes = "Return list spare parts details type responses" )
    public ResponseEntity<List<?>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
    }


    @PostMapping()
    @ApiOperation(value = "create new spare parts", notes = "Return a spare parts type response" )
    public ResponseEntity<?> partsAdd(
            @RequestBody SparePartsRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.add(request));
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "find by id and update spare parts", notes = "returns modified spare parts ty response" )
    public ResponseEntity<?> update(
            @RequestBody SparePartsRequest part,
            @PathVariable Long id)  {
        return ResponseEntity.status(HttpStatus.OK).body(service.update(id, part));
    }*/
}
