package org.example.taskmanager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class DisplayHomePage {
    @GetMapping("/")

    public String showHomePage() {
        return "index";
    }
}
