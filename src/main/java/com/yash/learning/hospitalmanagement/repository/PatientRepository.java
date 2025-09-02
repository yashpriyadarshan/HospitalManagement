package com.yash.learning.hospitalmanagement.repository;

import com.yash.learning.hospitalmanagement.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
