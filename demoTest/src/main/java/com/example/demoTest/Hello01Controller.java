package com.example.demoTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@Controller
public class Hello01Controller {

    @GetMapping("/startc")
    public String Start() {
        return "start.html";
    }
}
