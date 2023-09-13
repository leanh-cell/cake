package com.example.cakebanana.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @GetMapping("/shop")
    public String shop() {
        return "shop";
    }



}
