package com.example.MedService.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Account {
    // класс модель - иммитация аккаунта пользователя БД

    @Id
    private Long id; // ключ - уникальный id
    private String email, password; // почта и пароль. наверное сюда еще данные профиля

    // пишем геттеры и сеттеры


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }


}
