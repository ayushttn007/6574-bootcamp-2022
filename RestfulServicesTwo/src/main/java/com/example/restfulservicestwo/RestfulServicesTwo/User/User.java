package com.example.restfulservicestwo.RestfulServicesTwo.User;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties("password")
@JsonFilter("SomeBeanFilter")
public class User {

    private String name;
    private String password;
    private int age;
    private String city;

    public User(String name, String password, int age, String city) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.city = city;
    }
    public User(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
