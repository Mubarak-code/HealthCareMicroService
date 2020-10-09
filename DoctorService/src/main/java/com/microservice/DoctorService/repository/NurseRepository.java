package com.microservice.DoctorService.repository;

import com.microservice.DoctorService.model.NurseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NurseRepository extends JpaRepository<NurseEntity, Long> {

}
