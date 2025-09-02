package com.yash.learning.hospitalmanagement.repository.serviceImplementation;

import com.yash.learning.hospitalmanagement.entity.Patient;
import com.yash.learning.hospitalmanagement.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImplementation {

    @Autowired
    private final PatientRepository patientRepository;

    public Patient getPatientById(long id) {
        return patientRepository.findById(id).orElse(null);
    }
}
