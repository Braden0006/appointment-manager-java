package org.example.taskmanager.controllers;

import org.example.taskmanager.handlingTaskSubmission.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class TaskFormController {

    @GetMapping("/appointment")
    public String taskForm(Model model) {
        model.addAttribute("createTaskPage", new Task());
        return "createTaskPage";
    }
}
