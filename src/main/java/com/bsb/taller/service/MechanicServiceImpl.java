package com.bsb.taller.service;

import com.bsb.taller.models.entity.Mechanic;
import com.bsb.taller.service.abs.DataService;
import com.bsb.taller.service.abs.MechanicService;
import org.springframework.stereotype.Service;

@Service
public class MechanicServiceImpl extends DataService<Mechanic>implements MechanicService {
}
