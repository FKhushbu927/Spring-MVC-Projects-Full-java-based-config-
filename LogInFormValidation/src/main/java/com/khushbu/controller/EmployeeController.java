package com.khushbu.controller;

import com.khushbu.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class EmployeeController {
    @RequestMapping("/")
    public String index(Model model){
        return "index";
    }
    @RequestMapping(value="/login-here",method= RequestMethod.GET)
    public String viewPage(Model model){
        model.addAttribute("emp",new Employee());
        return "viewPage";
    }
    @RequestMapping(value="/save-login",method = RequestMethod.POST)
    public String login(Model model, @Valid @ModelAttribute("emp")Employee e, BindingResult bindingResult){
      if(bindingResult.hasErrors()){
          return "viewPage";
      }
      else
          return "final";
    }

}
