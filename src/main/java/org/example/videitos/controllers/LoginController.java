package org.example.videitos.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

    @GetMapping("/")
    public String login(){ return "login";}


}
