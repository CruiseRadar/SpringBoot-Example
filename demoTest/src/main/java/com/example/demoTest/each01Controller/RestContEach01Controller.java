package com.example.demoTest.each01Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestContEach01Controller {

    @GetMapping("/restconteach")
    public String StartRest() {
        return "Start Rest Controller in Package. . . . .";
    }

}
