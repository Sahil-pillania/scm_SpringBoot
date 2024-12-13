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

    // about route
    @GetMapping("/about")
    public String aboutPage() {
        System.out.println("About page loading...");
        return "about";
    }

    @GetMapping("/services")
    public String servicesPage() {
        return "services";
    }

    // contact page

    @GetMapping("/contact")
    public String contact() {
        return new String("contact");
    }

    @GetMapping("/login")
    public String login() {
        return new String("login");
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }
    
    

}
