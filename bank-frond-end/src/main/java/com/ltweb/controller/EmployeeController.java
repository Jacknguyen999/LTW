package com.ltweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    
    @GetMapping
    public String homeView() {
        return "/employee/employee-view";
    }

    @GetMapping("/add")
    public String addEmployeeView() {
        return "/employee/add-employee-view";
    }

    @GetMapping("/edit/{id}")
    public String editEmployeeView(@PathVariable Integer id, Model model) {
        model.addAttribute("id", id);
        return "/employee/edit-employee-view";
    }
}
