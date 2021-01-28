package com.ria.developer.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

    @Autowired
    DoctorService doctorService;


    @GetMapping("/doctor")
    public String getDoctor()
    {
        return doctorService.getDoctors().toString();
    }
}
