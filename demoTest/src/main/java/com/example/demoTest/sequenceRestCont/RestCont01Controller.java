package com.example.demoTest.sequenceRestCont;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCont01Controller {
    @GetMapping("/restcont")
    public String StartRest() {
        return "Start Rest Controller . . . . .";
    }

}
