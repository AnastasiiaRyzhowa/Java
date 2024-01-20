package com.hospital.ekg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.ekg.model.PatientEntity;

public interface PatientRepository extends JpaRepository<PatientEntity, Integer>{
    
}
