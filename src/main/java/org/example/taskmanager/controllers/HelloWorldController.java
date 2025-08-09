package org.example.taskmanager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @GetMapping("/test")
    @ResponseBody
    public String printHello() {
        return "Hello Worldies!!!";
    }

    @GetMapping("/test2")
    public String printHello2(Model model) {
        model.addAttribute("message", "Have a great day!");
        model.addAttribute("rating", "99");
        model.addAttribute("report", "really good!!");
        return "helloPage";
    }

    @GetMapping("/test3")
    public ModelAndView displayHello() {
        ModelAndView mv = new ModelAndView();

        mv.addObject("message", "Have a super day!");
        mv.addObject("rating", "55");
        mv.setViewName("helloPage");

        return mv;
    }
}
