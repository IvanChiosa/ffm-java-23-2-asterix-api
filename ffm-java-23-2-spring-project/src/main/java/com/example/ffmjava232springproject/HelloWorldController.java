package com.example.ffmjava232springproject;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@SpringBootApplication

public class HelloWorldController {
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World";
    }

    @GetMapping("hello/{name}")
    public String halloName(@PathVariable String name) {
        return "Hello " + name;
    }
}
