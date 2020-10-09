package com.microservice.DoctorService.nurse;


import com.microservice.DoctorService.entity.NurseEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "NurseService")
public interface NurseServiceClient {

    @GetMapping("getallnurses")
    List<NurseEntity> getAllNurses();

}
