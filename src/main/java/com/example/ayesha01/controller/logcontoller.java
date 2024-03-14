package com.example.ayesha01.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.ayesha01.domain.domain;

import com.example.ayesha01.service.service;

@Controller
public class logcontoller {
 
    @Autowired
    private service service;
 
    @GetMapping("/")
    public String api()
    {
 
        return "log";
    }
 
    @PostMapping("/log")
    public String domain(@ModelAttribute("user") domain user) {
 
        domain oauthUser = service.log(user.getUsername(), user.getPassword());
 
        System.out.print(oauthUser);
        if (Objects.nonNull(oauthUser)) {
            return "redirect:/disp";
        } else {
            return "redirect:/";
        }
    }
 
    @GetMapping("/disp")
    public String display() {
        return "disp";
    }
}
