package com.bsb.taller.service;

import com.bsb.taller.models.request.SparePartsRequest;
import com.bsb.taller.models.response.SparePartsResponse;
import com.bsb.taller.service.abs.SparePartsService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SparePartsServiceImpl implements SparePartsService {
    @Override
    public SparePartsResponse findByName(String name) {
        return null;
    }

    @Override
    public List<SparePartsResponse> getAll() {
        return null;
    }

    @Override
    public SparePartsResponse add(SparePartsRequest request) {
        return null;
    }

    @Override
    public SparePartsResponse update(Long id, SparePartsRequest request) {
        return null;
    }
}
