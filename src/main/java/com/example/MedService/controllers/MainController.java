package com.example.MedService.controllers;

import com.example.MedService.dto.AccountDto;
import com.example.MedService.dto.ClientReg;
import com.example.MedService.dto.Login;
import com.example.MedService.service.ServicePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/") // функция обрабатывает главную страничку
    public String signin(Model model) {
        model.addAttribute("title", "Вход в систему"); // передаем название странички
        return "signin";
    }

    @GetMapping("/profile") // функция обрабатывает главную страничку
    public String profile(Model model) {
        model.addAttribute("title", "Профиль"); // передаем название странички
        return "profile";
    }

    @GetMapping("/registration") // функция обрабатывает страницу с регистрацией
    public String registration(Model model) {
        model.addAttribute("title", "Записаться к врачу"); // передаем название странички
        return "registration";
    }

    @GetMapping("/schedule") // функция обрабатывает страницу с расписанием
    public String schedule(Model model) {
        model.addAttribute("title", "Расписание"); // передаем название странички
        return "schedule";
    }

    // Обработка форм
    @Autowired(required = false)
    private ServicePage servicePage;

    @PostMapping("/sign") // авторизация
    public void login(Login login){
        servicePage.createUser(login);
        System.out.printf("");
    }

    @PostMapping("/docinfo") // информация о враче
    public void changeDocInfo(AccountDto docAccount){
    }

    @PostMapping("/clientReg") // информация о враче
    public void clientReg(ClientReg client){
        servicePage.makeOrder(client);
    }


}