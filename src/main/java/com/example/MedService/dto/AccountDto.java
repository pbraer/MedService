package com.example.MedService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AccountDto {

    private String id;
    private String email;
    private String password;
    private String firstname;
    private String lastname;
    private String middlename = null;
    private String qualif = null;
    private String image;
    private Boolean monday = false;
    private Boolean tuesday = false;
    private Boolean wednesday = false;
    private Boolean thursday = false;
    private Boolean friday = false;
    private String timeFrom = null;
    private String timeTo = null;
}
