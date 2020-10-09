package com.microservice.ReceptionistService.service;


import com.microservice.ReceptionistService.entity.Receptionist;
import com.microservice.ReceptionistService.repository.ReceptionistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReceptionistService {

    private final ReceptionistRepository receptionistRepository;

    public List<Receptionist> getAllReceptionist(){
        return receptionistRepository.findAll();
    }
}
