package com.example.MedService.repository;

import com.example.MedService.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID>{
    @Query(value = "SELECT * FROM doctors", nativeQuery = true) // непонятно это что? как работает?
    List<Account> findAllStudents();
}
