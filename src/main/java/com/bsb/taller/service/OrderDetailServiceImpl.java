package com.bsb.taller.service;

import com.bsb.taller.models.request.OrderDetailRequest;
import com.bsb.taller.models.response.OrderDetailResponse;
import com.bsb.taller.service.abs.OrderDetailService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderDetailServiceImpl implements OrderDetailService {
    @Override
    public OrderDetailResponse findByName(String name) {
        return null;
    }

    @Override
    public List<OrderDetailResponse> getAll() {
        return null;
    }

    @Override
    public OrderDetailResponse add(OrderDetailRequest request) {
        return null;
    }

    @Override
    public OrderDetailResponse update(Long id, OrderDetailRequest request) {
        return null;
    }
}
