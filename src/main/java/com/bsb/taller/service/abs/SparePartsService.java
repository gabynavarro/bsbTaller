package com.bsb.taller.service.abs;

import com.bsb.taller.models.request.SparePartsRequest;
import com.bsb.taller.models.response.SparePartsResponse;

import java.util.List;

public interface SparePartsService {
    SparePartsResponse findByName(String name);
    List<SparePartsResponse> getAll();
    SparePartsResponse add(SparePartsRequest request);
    SparePartsResponse update(Long id, SparePartsRequest request);
}
