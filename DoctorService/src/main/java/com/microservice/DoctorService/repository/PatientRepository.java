package com.microservice.DoctorService.repository;


import com.microservice.DoctorService.model.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<PatientEntity, Long> {

    PatientEntity findByPatientNumber (Long patientNumber);
    PatientEntity findByPatientName (String patientName);
    void deleteByPatientNumber(Long patientNUmber);

}
