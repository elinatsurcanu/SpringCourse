package com.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                           @RequestParam(value = "surname", required = false) String surname,
                            Model model) {


        //System.out.println("Hello, " + name + " " + surname);
        model.addAttribute("message","Hello, " + name + " " + surname);

        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }

    @GetMapping("/calculator")
    public String calculator( @RequestParam("a") int a,
                              @RequestParam("b") int b,
                              @RequestParam("action") String action,
                              Model model){

        double result;
        switch (action){
            case "plus":
                result = a + b;
                break;
            case "minus":
                result = a - b;
                break;
            case "umnojenie":
                result =  a * b;
                break;
            case "delenie":
                result = a / (double)b;
                break;
            default:
                result = 999;
                break;
        }

        model.addAttribute("result", result);

        return "first/calculator";
    }
}
