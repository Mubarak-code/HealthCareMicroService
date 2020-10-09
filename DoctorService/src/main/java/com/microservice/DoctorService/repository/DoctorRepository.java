package com.microservice.DoctorService.repository;

import com.microservice.DoctorService.model.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorEntity, Long> {

    DoctorEntity findByDoctorNumber (Long doctorNumber);
    DoctorEntity findByDoctorName (String doctorName);


}
