package com.example.restapi.restapi.welcomespringbootcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeSpringBoot {
   // @RequestMapping(method = RequestMethod.GET,path = "/welcome")
    @GetMapping(path = "/")
        public String welcomeSpring(){
            String message = "Welcome to Spring Boot";
            return message;
        }
}
