package com.hospital.ekg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.ekg.model.SurveyEntity;

public interface SurveyRepository extends JpaRepository<SurveyEntity, Integer> {
    
}
