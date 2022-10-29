package com.example.restfulservicestwo.RestfulServicesTwo.Controllers;

import com.example.restfulservicestwo.RestfulServicesTwo.User.User;
import com.example.restfulservicestwo.RestfulServicesTwo.User.UserDoaService;
import com.example.restfulservicestwo.RestfulServicesTwo.User.UserVersionOne;
import com.example.restfulservicestwo.RestfulServicesTwo.User.UserVersionTwo;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserVersioningController {

    @Autowired
    UserDoaService UserVersionService;


    @GetMapping("/userversion1")
    public List<UserVersionOne> userVersionOne(){
        return UserVersionService.getUserVOneList();
    }

    @GetMapping("/userversion2")
    public List<UserVersionTwo> userVersionTwo(){
        return UserVersionService.getUserVTwoList();
    }

    // userTwo versioning using parameter
    @GetMapping(value = "/user/param",params = "v1")
    public List<UserVersionOne> UserVersionOneParam(){
        return UserVersionService.getUserVOneList();
    }

    // userOne versioning using parameter
    @GetMapping(value = "/user/param",params = "v2")
    public  List<UserVersionTwo> UserVersionTwoParam(){
        return UserVersionService.getUserVTwoList();
    }

    // user version 1 header
    @GetMapping(value = "/user/header",headers = "X-API-VERSION=1")
    public List<UserVersionOne> UserVersionOneHeaderVersioning(){
        return UserVersionService.getUserVOneList();
    }

   // user version 2 header
    @GetMapping(value = "/user/header",headers = "X-API-VERSION=2")
    public List<UserVersionTwo> UserVersionTwoHeaderVersioning(){
        return UserVersionService.getUserVTwoList();
    }


}
