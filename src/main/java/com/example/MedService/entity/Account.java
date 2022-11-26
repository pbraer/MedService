package com.example.MedService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "doctors")
public class Account {
    // класс модель - иммитация аккаунта пользователя БД

    @Id
    private UUID id; // ключ - уникальный id
    @Column(name = "email")
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
