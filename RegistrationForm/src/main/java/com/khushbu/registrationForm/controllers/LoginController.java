package com.khushbu.registrationForm.controllers;

import com.khushbu.registrationForm.model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @RequestMapping(value="/login-form",method= RequestMethod.GET)
    public String loginForm(Model model){
        model.addAttribute("login",new Login());
        return "loginForm";
    }
    @RequestMapping(value="/save-login-form",method = RequestMethod.POST)
    public String saveLoginForm(Model model, @ModelAttribute Login login){
        model.addAttribute("login",login);
        return "saveLoginForm";
    }
}
