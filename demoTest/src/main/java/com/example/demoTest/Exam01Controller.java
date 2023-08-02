package com.example.demoTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Exam01Controller {

    @GetMapping("/startc")
    public String Start() {
        return "start.html";
    }
}
