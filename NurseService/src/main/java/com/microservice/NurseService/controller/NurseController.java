package com.microservice.NurseService.controller;


import com.microservice.NurseService.entity.Nurse;
import com.microservice.NurseService.service.NurseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class NurseController {

    private final NurseService nurseService;


    @GetMapping("getallnurses")
    public List<Nurse> getAllNurses(){
        return nurseService.getAllNurses();
    }
}
