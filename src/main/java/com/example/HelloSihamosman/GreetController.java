package com.example.HelloSihamosman;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
    @GetMapping(path="/")
    public String greetperson() {
        return "Hello Siham Osman" ;
    }
    @GetMapping(path = "/message")
    public String todaysmessage () {
        return "Be happy don't worry." ;
    }
    @GetMapping(path = "/Java")
    public String javaprogramming () {
        return "Java is a versatile and widely-used programming language that has been around since 1995." ;
    }
}
