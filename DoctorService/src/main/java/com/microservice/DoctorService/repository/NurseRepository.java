package com.microservice.DoctorService.repository;

import com.microservice.DoctorService.entity.NurseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NurseRepository extends JpaRepository<NurseEntity, Long> {

}
