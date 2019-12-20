package com.codegym.controller;

import com.codegym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.codegym.model.User;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/")
    public String showForm(Model model){
        model.addAttribute("user", new User());

        return "index";
    }
    @PostMapping("/")
    public String checkValidation (@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model){
        new User().validate(user, bindingResult);
        if (bindingResult.hasFieldErrors()){
            return "index";
        }
        else {
            model.addAttribute("user", user.getPhone_number());
            return "result";
        }
    }

}
