package com.bsb.taller.service.abs;

import com.bsb.taller.models.request.OrderDetailRequest;
import com.bsb.taller.models.request.OrderRequest;
import com.bsb.taller.models.response.OrderDetailResponse;
import com.bsb.taller.models.response.OrderResponse;

import java.util.List;

public interface OrderDetailService {
   OrderDetailResponse findByName(String name);
    List<OrderDetailResponse> getAll();
    OrderDetailResponse add(OrderDetailRequest request);
    OrderDetailResponse update(Long id, OrderDetailRequest request);

}
