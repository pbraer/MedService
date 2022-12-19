package com.example.MedService.dto;

import lombok.Data;

@Data
public class DoctorDto {

    private Long id;
    private String email;
    private String firstname;
    private String lastname;
    public DoctorDto(Long id, String email, String firstname, String lastname) {
        this.id = id;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
    }


}
