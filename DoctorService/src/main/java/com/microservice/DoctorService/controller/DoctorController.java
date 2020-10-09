package com.microservice.DoctorService.controller;


import com.microservice.DoctorService.entity.NurseEntity;
import com.microservice.DoctorService.nurse.NurseServiceClient;
import com.microservice.DoctorService.patient.PatientServiceClient;
import com.microservice.DoctorService.entity.PatientEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DoctorController {


    private final PatientServiceClient patientServiceClient;

    private final NurseServiceClient nurseServiceClient;

    @GetMapping("doctor/getallnurses")
    public List<NurseEntity> getallNurses(){
        return nurseServiceClient.getAllNurses();
    }

    @GetMapping("doctor/getallpatient")
    public List<PatientEntity> getpatient(){
        System.out.println("calling feign");
        return patientServiceClient.getAllPatients();

    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }

}
