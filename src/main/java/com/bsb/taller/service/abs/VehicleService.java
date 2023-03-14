package com.bsb.taller.service.abs;

import com.bsb.taller.models.request.OrderRequest;
import com.bsb.taller.models.request.VehicleRequest;
import com.bsb.taller.models.response.OrderResponse;
import com.bsb.taller.models.response.VehicleResponse;

import java.util.List;

public interface VehicleService {
   VehicleResponse findByPatent(String patent);
    List<VehicleResponse> getAll();
    VehicleResponse add(VehicleRequest request);
    VehicleResponse update(Long id, VehicleRequest request);

}
