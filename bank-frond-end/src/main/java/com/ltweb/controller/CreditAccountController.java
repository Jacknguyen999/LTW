package com.ltweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/credit")
public class CreditAccountController {
    
    @GetMapping
    public String homeView() {
        return "/credit/credit-view";
    }

    @GetMapping("/add")
    public String addCreditView() {
        return "/credit/add-credit-view";
    }

    @GetMapping("/edit/{id}")
    public String editCreditView(@PathVariable Integer id, Model model) {
        model.addAttribute("id", id);
        return "/credit/edit-credit-view";
    }
}
