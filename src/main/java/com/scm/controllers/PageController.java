package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")  
    public String home(Model model){
        System.out.println("Home page handler");
        model.addAttribute("name","Mayank");
        model.addAttribute("age","17");
        model.addAttribute("city","Hanumangarh");
        model.addAttribute("link","http://facebook.com");
        return "home";
    }
}
