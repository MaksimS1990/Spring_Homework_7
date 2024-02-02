package ru.geekbrains.Homework_7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/login")
    public String login() {
        return "login.html";
    }

    @GetMapping("/public-data")
    public String publicData() {
        return "public.html";
    }

    @GetMapping("/private-data")
    public String privateData() {
        return "private.html";
    }

    @GetMapping("/non-data")
    public String nonData() {
        return "non.html";
    }
}
