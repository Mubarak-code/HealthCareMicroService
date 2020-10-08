package com.microservice.DoctorService.repository;

import com.microservice.DoctorService.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    Doctor findByDoctorNumber (Long doctorNumber);
    Doctor findByDoctorName (String doctorName);


}
