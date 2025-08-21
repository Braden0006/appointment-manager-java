package org.example.appointmentmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class AppointmentManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppointmentManagerApplication.class, args);
    }

    @GetMapping("/")
    public String displayTasks() {
        return "homePage";
    }
}