package com.microservice.DoctorService.controller;


import com.microservice.DoctorService.Patient.PatientServiceClient;
import com.microservice.DoctorService.model.PatientEntity;
import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DoctorController {


    private final PatientServiceClient patientServiceClient;

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
