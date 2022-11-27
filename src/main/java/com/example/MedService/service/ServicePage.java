package com.example.MedService.service;

import com.example.MedService.dto.Login;
import com.example.MedService.entity.Account;

@org.springframework.stereotype.Service
public class ServicePage {

//    private final AccountRepository accountRepository;
//
//    public ServicePage(AccountRepository accountRepository) {
//        this.accountRepository = accountRepository;
//    }

    public void createUser(Login login) {
        Account account = new Account();
        account.setEmail(login.getLogin());
        account.setPassword(login.getPass());

//        accountRepository.save(account);
//
//        List<Account> lisr = accountRepository.findAllDoctors();
        System.out.println("");
    }
}
