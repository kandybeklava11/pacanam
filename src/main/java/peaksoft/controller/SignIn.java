package peaksoft.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import peaksoft.entity.User;
import peaksoft.service.UserService;



@Controller
@RequestMapping("/signIn")
@RequiredArgsConstructor
public class SignIn {

    private final UserService userService;

    @GetMapping()
    public String showSignInPage(Model model) {
        model.addAttribute("newUser", new User());
        return "/user/signIn";
    }

    @PostMapping("/signInn")
    public ModelAndView signIn(@ModelAttribute("newUser") User user) {
        User foundUser = userService.getUserByUsername(user.getUserName());

        if (foundUser != null && foundUser.getPassword().equals(user.getPassword())) {
            System.out.println("User signed in successfully: " + foundUser);
            return new ModelAndView("redirect:/main");
        } else {
            System.out.println("Incorrect username or password");
            ModelAndView modelAndView = new ModelAndView("user/signIn");
            modelAndView.addObject("error", "Incorrect username or password");
            return modelAndView;
        }
    }
}



