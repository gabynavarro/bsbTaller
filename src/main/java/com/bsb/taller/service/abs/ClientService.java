package com.bsb.taller.service.abs;

import com.bsb.taller.models.request.ClientRequest;
import com.bsb.taller.models.request.EmployeeRequest;
import com.bsb.taller.models.response.ClientResponse;
import com.bsb.taller.models.response.EmployeeResponse;

import java.util.List;

public interface ClientService {
    ClientResponse findByEmail(String email);
    List<ClientResponse> getAll();
    ClientResponse add(ClientRequest request);
    ClientResponse update(Long id, ClientRequest request);
    void delete(Long id);
}
