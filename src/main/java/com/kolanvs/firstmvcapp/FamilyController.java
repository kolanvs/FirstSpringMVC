package com.kolanvs.firstmvcapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FamilyController {

    @GetMapping("/hello-family")
    public String helloFamily() {
        return "hellofamily";
    }

}
