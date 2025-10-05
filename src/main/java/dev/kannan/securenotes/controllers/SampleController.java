package dev.kannan.securenotes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SampleController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }
}
