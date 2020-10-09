package com.microservice.PatientService.controller;


import com.microservice.PatientService.entity.Patient;
import com.microservice.PatientService.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/allpatient")
    public List<Patient> getAllPatient(){
        return patientService.getAllPatients();
    }
}
