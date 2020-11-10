package com.khushbu.registrationForm.controllers;

import com.khushbu.registrationForm.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class RegistrationController {
    @RequestMapping(value="/registration-form",method= RequestMethod.GET)
    public String registration(Model model){
        model.addAttribute("registration",new User());
        return "registrationForm";
    }
    @RequestMapping(value ="/save-registration-form",method = RequestMethod.POST)
    public String saveRegiForm(Model model,@ModelAttribute User user){
        model.addAttribute("registrationForm",user);
        return "saveRegiForm";
    }
}
