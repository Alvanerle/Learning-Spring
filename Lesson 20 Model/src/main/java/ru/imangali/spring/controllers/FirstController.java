package ru.imangali.spring.controllers;

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
        model.addAttribute("message", String.format("Hello %s %s!", name, surname));

        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage(){
        return "first/goodbye";
    }

    @GetMapping("/calculator")
    public String calculator(@RequestParam("a") double a,
                             @RequestParam("b") double b,
                             @RequestParam("action") String action,
                             Model model){
        String response = "Incorrect operation";
        if(action.equals("multiplication")){
            response = String.format("%s * %s = %s", a, b, a * b);
        }
        else if(action.equals("addition")){
            response = String.format("%s + %s = %s", a, b, a + b);
        }
        else if(action.equals("subtraction")){
            response = String.format("%s - %s = %s", a, b, a - b);
        }
        else if(action.equals("division")){
            response = String.format("%s / %s = %s", a, b, a / b);
        }
        model.addAttribute("result", response);

        return "first/calculator";
    }
}
