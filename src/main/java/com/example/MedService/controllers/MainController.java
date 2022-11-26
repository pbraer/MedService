package com.example.MedService.controllers;

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


    @Autowired(required = false)
    private ServicePage servicePage;

    @PostMapping("/sign")
    public void login(Login login){
        servicePage.createUser(login);
        System.out.printf("");
    }

}