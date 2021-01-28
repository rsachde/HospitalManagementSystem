package com.ria.developer.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    @PostConstruct
    public void initDoctor()
    {
        doctorRepository.saveAll(Stream.of(new Doctor(101, "John", "Cardiac"),
                new Doctor(102,"peter","eye")).collect(Collectors.toList()));

    }

    public List<Doctor> getDoctors()
    {
        return doctorRepository.findAll();
    }
}
