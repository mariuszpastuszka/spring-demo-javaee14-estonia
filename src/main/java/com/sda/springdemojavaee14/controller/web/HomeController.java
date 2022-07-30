package com.sda.springdemojavaee14.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // / or /home
    @GetMapping({"/", "/home"})
    public String homePage() {
        return "index";
    }
}
