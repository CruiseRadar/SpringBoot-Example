package com.example.demoTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExamRest01Controller {
    @GetMapping("/startrc")
    public String StartRest() {
        return "Start Rest Controller . . . .";
    }

}
