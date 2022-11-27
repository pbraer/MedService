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
@Table(name = "orders")
public class Orders {
    // данные о записях, оставленных на сервисе

    @Id
    private UUID id; // ключ - уникальный id
    @Column(name = "date")
    private String spec = null;
    private String doctor = null;
    private String date = null;
    private String time = null;




}
