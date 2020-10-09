package com.microservice.NurseService.service;


import com.microservice.NurseService.entity.Nurse;
import com.microservice.NurseService.repository.NurseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NurseService {

    private final NurseRepository nurseRepository;

    public List<Nurse> getAllNurses(){
        return nurseRepository.findAll();
    }

}
