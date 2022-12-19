package com.example.MedService.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.stereotype.Component;

@Entity
@Data
public class Account {
    // класс модель - иммитация аккаунта пользователя БД

    @Id
    private Long id; // ключ - уникальный id
    private String email, password; // почта и пароль. наверное сюда еще данные профиля



}
