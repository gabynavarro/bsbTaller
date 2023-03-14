package com.bsb.taller.controllers;

import com.bsb.taller.models.request.ClientRequest;
import com.bsb.taller.models.request.OrderRequest;
import com.bsb.taller.service.abs.ClientService;
import com.bsb.taller.service.abs.OrderService;
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
@Api(value = "Order Controller", tags = "Actions allowed for order")
@RequestMapping(name = "/api/v1/order")
public class OrderController {
    private final OrderService service;
    @GetMapping("name")
    @ApiOperation(value = "find by name order", notes = "Return order type response" )
    public ResponseEntity<?> getOrderName(@RequestParam(name = "name", required = false) String name) {
        return ResponseEntity.status( HttpStatus.OK ).body(service.findByName(name));
    }

    @GetMapping
    @ApiOperation(value = "find all orders", notes = "Return list orders type responses" )
    public ResponseEntity<List<?>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
    }


    @PostMapping()
    @ApiOperation(value = "create new order", notes = "Return a order type response" )
    public ResponseEntity<?> orderAdd(
            @RequestBody OrderRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.add(request));
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "find by id and update order", notes = "returns modified order ty response" )
    public ResponseEntity<?> update(
            @RequestBody OrderRequest client,
            @PathVariable Long id)  {
        return ResponseEntity.status(HttpStatus.OK).body(service.update(id, client));
    }

}
