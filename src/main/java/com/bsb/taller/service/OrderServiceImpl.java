package com.bsb.taller.service;

import com.bsb.taller.models.request.OrderRequest;
import com.bsb.taller.models.response.OrderResponse;
import com.bsb.taller.service.abs.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public OrderResponse findByName(String name) {
        return null;
    }

    @Override
    public List<OrderResponse> getAll() {
        return null;
    }

    @Override
    public OrderResponse add(OrderRequest request) {
        return null;
    }

    @Override
    public OrderResponse update(Long id, OrderRequest request) {
        return null;
    }
}
