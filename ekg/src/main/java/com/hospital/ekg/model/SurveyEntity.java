package com.hospital.ekg.model;

import java.time.LocalDateTime;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "surveys")
public class SurveyEntity extends AbstractEntity{
    
    @Id
    @GeneratedValue
    private int id;

    @Column
    private LocalDateTime dateSurvey;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="patientId", nullable = false)
    @JsonIgnore
    private PatientEntity patient;

    @JsonIgnore
    @OneToMany(mappedBy = "survey",
                fetch = FetchType.LAZY,
                cascade = CascadeType.ALL)
    private Set<EKGEntity> ekgResults;

}
