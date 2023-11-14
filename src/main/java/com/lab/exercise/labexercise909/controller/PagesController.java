package com.lab.exercise.labexercise909.controller;

import com.lab.exercise.labexercise909.Exception.UserException;
import com.lab.exercise.labexercise909.entity.User;
import com.lab.exercise.labexercise909.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PagesController {

    @Autowired
    private UserServiceImpl userService;


    @GetMapping("/")
    public String showHomePage(Model model){
//        model.addAttribute("allUserList",userService.getAllUsers());
        return "index";
    }

    @GetMapping("/add")
    public String addUser(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "newuser";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute("user") User user){
        userService.save(user);
        return "redirect:/";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String updateForm(@PathVariable(value="id") Long id,Model model) throws UserException {
        User user = userService.getById(id);
        model.addAttribute("user",user);
        return "update";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable(value="id") Long id,Model model){
        userService.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/search")
    public String showSearchPage(Model model){
//        model.addAttribute("allUserList",userService.getAllUsers());
        return "search";
    }

    @GetMapping("/user")
    public String showUserage(Model model){
        model.addAttribute("allUserList",userService.getAllUsers());
        return "user";
    }

    @PostMapping("/login")
    public String login(@PathVariable(value="email") String email,@PathVariable(value="password") String password,Model model){

        return "redirect:/";
    }
}
