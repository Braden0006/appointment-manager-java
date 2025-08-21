package org.example.appointmentmanager.controllers;

import org.example.appointmentmanager.handlingAppointmentSubmission.Appointment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
class AppointmentFormController {

    @GetMapping("/appointment")
    public String taskForm(Model model) {
        model.addAttribute("appointment", new Appointment());
        return "createAppointmentPage";
    }

    @PostMapping("/appointment")
    public String taskSubmit(@ModelAttribute Appointment appointment, Model model) {
       model.addAttribute("appointment", appointment);
       return "appointmentResultPage";
    }
}
