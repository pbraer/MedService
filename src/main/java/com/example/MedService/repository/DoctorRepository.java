package com.example.MedService.repository;

import com.example.MedService.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    @Query(value = "SELECT * FROM doctor WHERE some_spec = ?1", nativeQuery = true)
    List<Doctor> findAllBySpec(String spec);
}
