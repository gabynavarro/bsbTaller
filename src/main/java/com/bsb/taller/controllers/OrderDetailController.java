package com.bsb.taller.controllers;

import com.bsb.taller.models.request.OrderDetailRequest;
import com.bsb.taller.models.request.OrderRequest;
import com.bsb.taller.service.abs.OrderDetailService;
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
@Api(value = "Order detail Controller", tags = "Actions allowed for order detail")
@RequestMapping(name = "/api/v1/orderdetails")
public class OrderDetailController {
 /*   private final OrderDetailService service;
    @GetMapping("name")
    @ApiOperation(value = "find by order detail", notes = "Return order detail type response" )
    public ResponseEntity<?> getOrderName(@RequestParam(name = "name", required = false) String name) {
        return ResponseEntity.status( HttpStatus.OK ).body(service.findByName(name));
    }

    @GetMapping
    @ApiOperation(value = "find all order details", notes = "Return list order details type responses" )
    public ResponseEntity<List<?>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
    }


    @PostMapping()
    @ApiOperation(value = "create new order detail", notes = "Return a order detail type response" )
    public ResponseEntity<?> orderAdd(
            @RequestBody OrderDetailRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.add(request));
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "find by id and update order detail", notes = "returns modified order detail ty response" )
    public ResponseEntity<?> update(
            @RequestBody OrderDetailRequest detail,
            @PathVariable Long id)  {
        return ResponseEntity.status(HttpStatus.OK).body(service.update(id, detail));
    }*/

}
