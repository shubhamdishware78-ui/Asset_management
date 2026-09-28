package com.shubham.asset_management.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(
            @RequestParam String username,
            @RequestParam String password,
            HttpSession session,
            Model model) {

        if(username.equals("admin")
                && password.equals("admin123")) {

            session.setAttribute(
                    "loggedIn",
                    true);

            return "redirect:/";
        }

        model.addAttribute(
                "error",
                "Invalid Username or Password");

        return "login";
    }

    @GetMapping("/logout")
    public String logout(
            HttpSession session) {

        session.invalidate();

        return "redirect:/login";
    }
}