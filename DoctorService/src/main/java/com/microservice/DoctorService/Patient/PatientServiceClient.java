package com.microservice.DoctorService.Patient;


import com.microservice.DoctorService.model.PatientEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "patientService" , url = "http://localhost:8087")
public interface PatientServiceClient {

    @GetMapping("allpatient")
    List<PatientEntity> getAllPatients();
}
