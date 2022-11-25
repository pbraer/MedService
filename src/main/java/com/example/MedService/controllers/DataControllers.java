package com.example.MedService.controllers;

import com.example.MedService.dao.AccountDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DataControllers {

    private final AccountDAO accountDAO;

    public DataControllers(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    //@PostMapping()
    //public void read(@RequestParam("emailInput") String email, @RequestParam("passwordInput") String password,
    //                 Model model) {


        // AccountDAO.придумать медот чтобы достать данные всех почт и паролей
        //этот метот по идее читаеть с консоли
        // здесь реализация авторизации

    //}
}
