package com.ltweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class ClientController {

    @GetMapping
    public String homeView() {
        return "/client/client-view";
    }

    @GetMapping("/add")
    public String addClientView() {
        return "/client/add-client-view";
    }

    @GetMapping("/edit/{id}")
    public String editClientView(@PathVariable Integer id, Model model) {
        model.addAttribute("id", id);
        return "/client/edit-client-view";
    }
}
