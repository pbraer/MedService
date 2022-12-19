package com.example.MedService.service;

import com.example.MedService.dto.DoctorDto;
import com.example.MedService.entity.Doctor;
import com.example.MedService.repository.DoctorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    private final DoctorRepository accountRepository;

    public DoctorService(DoctorRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<DoctorDto> getAccountsBySomeSpec(String s) {
        List<Doctor> accounts = accountRepository.findAllBySpec(s);
        if (accounts != null && accounts.size() > 0) {
            return accounts.stream().map(a -> new DoctorDto(a.getId(), a.getEmail(), a.getFirstname(), a.getLastname())).toList();
        }
        return null;
    }
}
