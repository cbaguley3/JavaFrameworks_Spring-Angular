package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/outOfStock")
public class OutOfStockController {
    @GetMapping
    public String showOutOfStockPage() {
        return "outOfStock";
    }
}
