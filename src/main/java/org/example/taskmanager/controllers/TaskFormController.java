package org.example.taskmanager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class TaskFormController {

    @GetMapping("/task")
    public String taskForm() {
        return "createTaskPage";
    }
}
