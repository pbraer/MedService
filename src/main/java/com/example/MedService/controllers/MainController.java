package com.example.MedService.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/") // функция обрабатывает главную страничку
    public String profile(Model model) {
        model.addAttribute("title", "Вход в систему"); // передаем название странички
        return "signin";
    }

}