package com.example.restfulservicestwo.RestfulServicesTwo.User;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDoaService {
    static List<User> userList = new ArrayList<>();
    static List<UserVersionOne> userVOneList = new ArrayList<>();
    static List<UserVersionTwo> userVTwoList = new ArrayList<>();

    static {
        userList.add(
                new User(
                        "AyushSharma",
                        "ayushpass@123",
                        23, "GreaterNoida"
                ));
        userList.add(
                new User(
                        "Hansraj",
                        "hasrajpass@123",
                        56,
                        "Mumbai"
                ));
        userList.add(
                new User(
                        "Atharva",
                        "atharvapass@123",
                        22,
                        "Delhi"
                ));
        // Version One User Details
        userVOneList.add(
                new UserVersionOne(
                        "Ayush Sharma",
                        23,
                        "Shahdara"
                ));
        // Version Two User Details
        userVTwoList.add(
                new UserVersionTwo(
                        "Ayush Sharma",
                        23,
                        "Shahdara",
                        "SoftWare Engineer",
                        "B.Tech"
                ));

    }

    public User addUser(User user) {
        userList.add(user);

        return user;
    }

    public List<User> getAllUsers() {
        return userList;
    }
    //
    public List<UserVersionOne> getUserVOneList(){
        return userVOneList;
    }

    public List<UserVersionTwo>  getUserVTwoList(){
        return userVTwoList;
    }
}
