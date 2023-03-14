package com.bsb.taller.service.abs;

import com.bsb.taller.models.request.LabourRequest;
import com.bsb.taller.models.request.OrderRequest;
import com.bsb.taller.models.response.LabourResponse;
import com.bsb.taller.models.response.OrderResponse;

import java.util.List;

public interface LabourService {
    List<LabourResponse> getAll();
    LabourResponse add(LabourRequest request);
    LabourResponse update(Long id, LabourRequest request);
}
