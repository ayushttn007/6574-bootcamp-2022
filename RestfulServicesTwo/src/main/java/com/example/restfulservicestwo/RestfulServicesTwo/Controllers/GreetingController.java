package com.example.restfulservicestwo.RestfulServicesTwo.Controllers;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class GreetingController {
    private MessageSource messageSource;


    @GetMapping ("/")
        public String Welcome(){
          String message = "Welcome to Spring Boot ";
          return message;
        }
   public GreetingController(MessageSource messageSource){
        this.messageSource = messageSource;
   }

   // controller for Internation greeting
   @GetMapping("greeting-international")
   public  String greetingsInternational(@RequestParam String username){
        Locale locale  = LocaleContextHolder.getLocale();
        return  messageSource.getMessage("hello.messages", null,"Default Message",locale) + " " + username;
   }



}
