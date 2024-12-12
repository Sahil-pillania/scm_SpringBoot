package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("name", "substring Technologies");
        System.out.println("home page 1 ");
        return "home";
    }

}