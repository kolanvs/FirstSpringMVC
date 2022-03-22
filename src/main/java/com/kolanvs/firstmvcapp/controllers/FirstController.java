package com.kolanvs.firstmvcapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "surname", required = false) String surname,
            Model model) {

        //System.out.println("Hello, " + name + " " + surname);
        model.addAttribute("message", "Hello, " + name + " " + surname);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }

    @GetMapping("/calculator")
    public String calculator(
            @RequestParam(value = "a", required = false) Integer a,
            @RequestParam(value = "b", required = false) Integer b,
            @RequestParam(value = "act", required = false) String action,
            Model model
                            ) {

        double result;
        switch (action) {
            case "add":
                result = (double) (a + b);
                break;
            case "sub":
                result = (double) (a - b);
                break;
            case "mul":
                result = (double) (a * b);
                break;
            case "div":
                result = (double)a / b;
                break;
            default: result = 0;
        }

        model.addAttribute("result", String.valueOf(result));

        return "first/calculator";

    }


    //TODO: Калькулятор!!!
}
