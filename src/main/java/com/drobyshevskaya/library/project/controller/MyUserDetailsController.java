package com.drobyshevskaya.library.project.controller;

import com.drobyshevskaya.library.project.entity.UserDetails;
import com.drobyshevskaya.library.project.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/library")
public class MyUserDetailsController {

    @Autowired
    private UserDetailsService userDetailsService;

    @GetMapping("/userDetails")
    public String showAllUsersDetails(Model model) {
        model.addAttribute("usersDetails", userDetailsService.getAllUserDetails());
        return "userDetails";
    }

    @GetMapping("/userDetails/{id}")
    public String getUserDetailsById(Model model, @PathVariable int id) {
        model.addAttribute("userDetails", userDetailsService.getUserDetailsById(id));
        return "userDetails";
    }

    @PostMapping("/userDetails/")
    public String addNewUserDetails(@RequestBody UserDetails userDetails) {
        userDetailsService.saveUserDetails(userDetails);
        return "userDetails";
    }

    @PutMapping("/userDetails/")
    public String updateUserDetails(@RequestBody UserDetails userDetails) {
        userDetailsService.saveUserDetails(userDetails);
        return "userDetails";
    }

    @DeleteMapping("/userDetails/{id}")
    public String deleteUserDetails(@PathVariable int id) {
        userDetailsService.deleteUserDetails(id);
        return "userDetails";
    }
}
