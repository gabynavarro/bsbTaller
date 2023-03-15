package com.bsb.taller.service;

import com.bsb.taller.models.request.VehicleRequest;
import com.bsb.taller.models.response.VehicleResponse;
import com.bsb.taller.service.abs.VehicleService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VehicleServiceImpl implements VehicleService {
    @Override
    public VehicleResponse findByPatent(String patent) {
        return null;
    }

    @Override
    public List<VehicleResponse> getAll() {
        return null;
    }

    @Override
    public VehicleResponse add(VehicleRequest request) {
        return null;
    }

    @Override
    public VehicleResponse update(Long id, VehicleRequest request) {
        return null;
    }
}
