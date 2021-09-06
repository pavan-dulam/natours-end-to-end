package com.pavan.natours.controllers;

import com.pavan.natours.entities.user_data;
import com.pavan.natours.repos.userRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class userController {
    @Autowired
   private userRepository userRepository;
    @RequestMapping("/SignUp")
    public String showRegistrationPage(){
        return "login/signUp";
    }

    @RequestMapping(value="/Registration" ,method=RequestMethod.POST)
    public String saveUser(@ModelAttribute("user") user_data user){
        userRepository.save(user);
        return "login/signIn";
    }

    @RequestMapping(value="/signIn" ,method=RequestMethod.POST)
    public String login(@ModelAttribute("email") String email, @ModelAttribute("pass") String pass,Model model)
    {
        user_data user = userRepository.findByUemail(email);
        if(user.getUpass().equals(pass))
        {
            return "redirect:/";
        }
        else{
                model.addAttribute("msg", "Invalid Email or Password. Please try again!");
                return "login/signIn";
        }
        
    }
}
