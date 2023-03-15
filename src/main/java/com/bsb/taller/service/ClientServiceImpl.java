package com.bsb.taller.service;

import com.bsb.taller.models.entity.Client;
import com.bsb.taller.models.request.ClientRequest;
import com.bsb.taller.models.response.ClientResponse;
import com.bsb.taller.service.abs.ClientService;
import com.bsb.taller.service.abs.DataService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl extends DataService<Client> implements ClientService {
    @Override
    public ClientResponse findByEmail(String email) {
        return null;
    }

    @Override
    public List<ClientResponse> getAll() {
        return null;
    }

    @Override
    public ClientResponse add(ClientRequest request) {
        return null;
    }

    @Override
    public ClientResponse update(Long id, ClientRequest request) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
