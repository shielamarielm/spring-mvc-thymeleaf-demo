package com.example.demo.controller;

import com.example.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public String showHomepage(Model model) {
        model.addAttribute("welcomeMessage",
                messageService.getWelcomeMessage());
        return "home";
    }
}