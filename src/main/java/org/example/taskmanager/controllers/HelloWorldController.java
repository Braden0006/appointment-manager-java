package org.example.taskmanager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @GetMapping("/test")
    @ResponseBody

    public String printHello() {
        return "Hello Worldies!!!";
    }
}
