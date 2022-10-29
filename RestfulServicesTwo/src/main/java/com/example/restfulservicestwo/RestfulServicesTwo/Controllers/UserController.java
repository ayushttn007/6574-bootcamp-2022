package com.example.restfulservicestwo.RestfulServicesTwo.Controllers;

import com.example.restfulservicestwo.RestfulServicesTwo.User.User;
import com.example.restfulservicestwo.RestfulServicesTwo.User.UserDoaService;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserDoaService userService;


    // User controller

    @Operation(summary = "")
    @PostMapping("/user")
    public ResponseEntity<User> addUser(@RequestBody User user){
        User newUser=userService.addUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.OK );
    }
  // Get users details Except password
    @GetMapping("/users")
    public MappingJacksonValue showUsers(){
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(userService.getAllUsers());

        SimpleBeanPropertyFilter filter =
                SimpleBeanPropertyFilter.filterOutAllExcept("name","city","age");

        FilterProvider filters =
                new SimpleFilterProvider().addFilter("SomeBeanFilter", filter );

        mappingJacksonValue.setFilters(filters );

        return mappingJacksonValue;

    }
    @GetMapping("/display")
    public List<User> displayAllUsers(){
        List<User> emp=userService.getAllUsers();
        return emp;
    }

}
