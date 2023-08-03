package com.example.demoTest.sequenceHtmlCont;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlCont01Controller {

    @GetMapping("/htmlcont")
    public String Start() {
        return "start.html";
    }
}
