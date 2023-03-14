package com.bsb.taller.service.abs;

import com.bsb.taller.models.request.ClientRequest;
import com.bsb.taller.models.request.MechanicRequest;
import com.bsb.taller.models.response.ClientResponse;
import com.bsb.taller.models.response.MechanicResponse;

import java.util.List;

public interface MechanicService {
    MechanicResponse findByName(String name);
    List<MechanicResponse> getAll();
    MechanicResponse add(MechanicRequest request);
    MechanicResponse update(Long id, MechanicRequest request);
    void delete(Long id);
}
