package com.bsb.taller.controllers;

import com.bsb.taller.models.request.ClientRequest;
import com.bsb.taller.service.abs.ClientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Api(value = "Client Controller", tags = "Actions allowed for client")
@RequestMapping(name = "/api/v1/client")
public class ClientController {
    private final ClientService service;
    @GetMapping("/email")
    @ApiOperation(value = "find by name client", notes = "Return client type response" )
    public ResponseEntity<?> getClientEmail(@RequestParam(name = "email", required = false) String email) {
        return ResponseEntity.status( HttpStatus.OK ).body(service.findByEmail(email));
    }

    @GetMapping("/clients")
    @ApiOperation(value = "find all clients", notes = "Return list clients type responses" )
    public ResponseEntity<List<?>> clientsAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
    }


    @PostMapping("/client_add")
    @ApiOperation(value = "create new client", notes = "Return a client type response" )
    public ResponseEntity<?> clientAdd(
            @RequestBody ClientRequest client) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.add(client));
    }

    @PutMapping("/client/{id}")
    @ApiOperation(value = "find by id and update client", notes = "returns modified client ty response" )
    public ResponseEntity<?> clientUpdate(
            @RequestBody ClientRequest client,
            @PathVariable Long id)  {
        return ResponseEntity.status(HttpStatus.OK).body(service.update(id, client));
    }
    @DeleteMapping("/client/{id}")
    @ApiOperation(value = "find by id and delete client", notes = "does not return client or response" )
    public ResponseEntity<Void> clientDelete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
