package com.userregistration.controller;

import com.userregistration.entity.User;
import com.userregistration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String registration(Model model){
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping("/register")
    public String registration(@ModelAttribute("user") User user){
        userService.save(user);
        return "redirect:/login";
    }
}
