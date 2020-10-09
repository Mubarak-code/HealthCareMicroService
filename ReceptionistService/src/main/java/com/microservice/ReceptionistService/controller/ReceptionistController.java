package com.microservice.ReceptionistService.controller;


import com.microservice.ReceptionistService.entity.Receptionist;
import com.microservice.ReceptionistService.service.ReceptionistService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ReceptionistController {

    private final ReceptionistService receptionistService;

    @GetMapping("allreceptionist")
    public List<Receptionist> getAllReceptionist(){
        return receptionistService.getAllReceptionist();
    }
}
