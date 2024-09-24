package com.ltweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/deposit")
public class DepositAccountController {

    @GetMapping
    public String homeView() {
        return "/deposit/deposit-view";
    }

    @GetMapping("/add")
    public String addDepositView() {
        return "/deposit/add-deposit-view";
    }

    @GetMapping("/edit/{id}")
    public String editDepositView(@PathVariable Integer id, Model model) {
        model.addAttribute("id", id);
        return "/deposit/edit-deposit-view";
    }
}
