package com.QIMATest.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomePageController {

    @GetMapping("/")
    public String welcome() {
        return "index"; // The name of the HTML file without the extension
    }
}
