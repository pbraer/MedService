package com.example.MedService.models;

public class Person {
    // доп модель в которую будем сохранять вытянутые данные с бд

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



}

