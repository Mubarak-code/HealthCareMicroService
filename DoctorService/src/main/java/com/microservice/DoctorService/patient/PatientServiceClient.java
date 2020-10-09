package com.microservice.DoctorService.patient;


import com.microservice.DoctorService.entity.PatientEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "PatientService")
public interface PatientServiceClient {

    @GetMapping("allpatient")
    List<PatientEntity> getAllPatients();
}
