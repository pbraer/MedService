package com.example.MedService.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

    @GetMapping("/onlinereg") // функция обрабатывает главную страничку
    public String onlinereg(Model model) {
        model.addAttribute("title", "Записаться к врачу"); // передаем название странички
        return "onlinereg";
    }

}