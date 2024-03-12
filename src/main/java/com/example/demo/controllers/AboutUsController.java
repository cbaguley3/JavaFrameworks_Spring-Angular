package com.example.demo.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/aboutUs")
public class AboutUsController {

    @GetMapping
    public String showAboutUsPage() {
        return "aboutUs";
    }
}
