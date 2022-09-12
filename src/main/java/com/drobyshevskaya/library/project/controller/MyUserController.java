package com.drobyshevskaya.library.project.controller;

import com.drobyshevskaya.library.project.entity.User;
import com.drobyshevskaya.library.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/library")
public class MyUserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String showAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

    @GetMapping("/users/{id}")
    public String getUserById(Model model, @PathVariable int id) {
        model.addAttribute("user", userService.getUserById(id));
        return "users";
    }

    @PostMapping("/users/")
    public String addNewUser(@RequestBody User user) {
        userService.saveUser(user);
        return "users";
    }

    @PutMapping("/users/")
    public String updateUser(@RequestBody User user) {
        userService.saveUser(user);
        return "users";
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id) {
       userService.deleteUser(id);
        return "users";
    }
}
