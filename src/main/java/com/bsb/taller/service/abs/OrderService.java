package com.bsb.taller.service.abs;

import com.bsb.taller.models.request.OrderRequest;
import com.bsb.taller.models.response.OrderResponse;

import java.util.List;

public interface OrderService {
   OrderResponse findByName(String name);
    List<OrderResponse> getAll();
    OrderResponse add(OrderRequest request);
    OrderResponse update(Long id, OrderRequest request);

}
