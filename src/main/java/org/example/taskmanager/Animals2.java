package org.example.taskmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@SpringBootApplication
class Animals2 {
    public static void main(String[] args) {
        SpringApplication.run(Animals2.class, args);
    }

    @GetMapping("/Animals")

    public String animals(@RequestParam(value="animal", defaultValue="animals!") String animal) {
        return String.format("I love %s", animal);
    }
}
