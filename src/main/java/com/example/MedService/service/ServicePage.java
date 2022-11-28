package com.example.MedService.service;

import com.example.MedService.dto.ClientReg;
import com.example.MedService.dto.Login;
import com.example.MedService.entity.Orders;
import com.example.MedService.entity.docAccount;

@org.springframework.stereotype.Service
public class ServicePage {

//    private final AccountRepository accountRepository;
//
//    public ServicePage(AccountRepository accountRepository) {
//        this.accountRepository = accountRepository;
//    }

    public void createUser(Login login) {
        docAccount account = new docAccount();
        account.setEmail(login.getLogin());
        account.setPassword(login.getPass());

//        accountRepository.save(account);
//
//        List<Account> lisr = accountRepository.findAllDoctors();
        System.out.println("");
    }

    public void makeOrder(ClientReg client) {
        Orders order = new Orders();
        order.setDate(order.getDate());
        order.setTime(order.getTime());
        order.setSpec(order.getSpec());
        order.setDoctor(order.getDoctor());
        System.out.println("");
    }
}
