package com.bsb.taller.service;

import com.bsb.taller.models.entity.Mechanic;
import com.bsb.taller.models.request.MechanicRequest;
import com.bsb.taller.models.response.MechanicResponse;
import com.bsb.taller.service.abs.DataService;
import com.bsb.taller.service.abs.MechanicService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MechanicServiceImpl extends DataService<Mechanic>implements MechanicService {
    @Override
    public MechanicResponse findByName(String name) {
        return null;
    }

    @Override
    public List<MechanicResponse> getAll() {
        return null;
    }

    @Override
    public MechanicResponse add(MechanicRequest request) {
        return null;
    }

    @Override
    public MechanicResponse update(Long id, MechanicRequest request) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
