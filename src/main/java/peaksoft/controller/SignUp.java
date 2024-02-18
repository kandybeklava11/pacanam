package peaksoft.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import peaksoft.entity.User;
import peaksoft.service.UserService;

@Controller
@RequestMapping("/signUp")
@RequiredArgsConstructor
public class SignUp {
    private final UserService userService;
    @GetMapping()
    public String create(Model model) {
        model.addAttribute("newUser", new User());
        return "/user/signUp";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute("newUser") User user) {
        userService.save(user);
        return "redirect: /main";
    }

}
