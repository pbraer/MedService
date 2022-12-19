package com.example.MedService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Doctor {
    @Id
    private Long id;
    private String email;
    private String password;
    private String firstname;
    private String lastname;
    private String middlename;
    private String qualif;
    private String image;
    private Boolean monday = false;
    private Boolean tuesday = false;
    private Boolean wednesday = false;
    private Boolean thursday = false;
    private Boolean friday = false;
    private String timeFrom;
    private String timeTo;

    @Column(name ="some_spec")
    private String someSpec;
}
