package com.bsb.taller.service;

import com.bsb.taller.models.entity.Client;
import com.bsb.taller.service.abs.ClientService;
import com.bsb.taller.service.abs.DataService;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl extends DataService<Client> implements ClientService {
}
