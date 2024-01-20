package com.hospital.ekg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.ekg.model.EKGEntity;

public interface EGKRepository extends JpaRepository<EKGEntity, Integer>{
    
}
