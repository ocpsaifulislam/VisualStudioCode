package com.shoaibtech.SpringBootProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/message")
    @ResponseBody
    public String plainMessage() {
        return "This is a plain message without a template";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/test")
    public String test(ModelMap model) {
        model.addAttribute("title", "Shoaib Tech");
        model.addAttribute("description", "Learn Spring Boot with Shoaib Tech");
        return "index";
    }
}
