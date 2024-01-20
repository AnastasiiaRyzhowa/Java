package com.hospital.ekg.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
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
@Table(name = "doctors")
public class DoctorEntity extends AbstractEntity{
    @Id
    @GeneratedValue
    private long id;
    
    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @ManyToMany
    private Set<RolesEntity> roles;

    @JsonIgnore
    @OneToMany(mappedBy = "doctor",
                fetch = FetchType.LAZY,
                cascade = CascadeType.ALL)
    private Set<PatientEntity> patients;
}
