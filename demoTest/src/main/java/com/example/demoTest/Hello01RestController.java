package com.example.demoTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
public class Hello01RestController {
    @GetMapping("/startrc")
    public String StartRest() {
        return "Start Rest Controller . .";
    }

}
