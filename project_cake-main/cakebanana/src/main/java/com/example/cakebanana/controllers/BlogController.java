package com.example.cakebanana.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }

    @GetMapping("/blog2")
    public String blog2() {
        return "blog2";
    }
}
