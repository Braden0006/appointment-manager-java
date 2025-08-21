package org.example.taskmanager.controllers;

import org.example.taskmanager.handlingTaskSubmission.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
class TaskFormController {

    @GetMapping("/appointment")
    public String taskForm(Model model) {
        model.addAttribute("appointment", new Task());
        return "createTaskPage";
    }

    @PostMapping("/appointment")
    public String taskSubmit(@ModelAttribute Task appointment, Model model) {
       model.addAttribute("appointment", appointment);
       return "appointmentResult";
    }
}
