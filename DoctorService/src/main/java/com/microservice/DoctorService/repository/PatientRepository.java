package com.microservice.DoctorService.repository;


import com.microservice.DoctorService.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    Patient findByPatientNumber (Long patientNumber);
    Patient findByPatientName (String patientName);
    void deleteByPatientNumber(Long patientNUmber);

}
