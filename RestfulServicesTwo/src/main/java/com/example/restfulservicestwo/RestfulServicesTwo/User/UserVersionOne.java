package com.example.restfulservicestwo.RestfulServicesTwo.User;

public class UserVersionOne {
    private String Username;
    private int Userage;
    private String Usercity;

    public UserVersionOne(String name, int age, String city) {
        this.Username = name;
        this.Userage = age;
        this.Usercity = city;
    }
    public UserVersionOne(){}

    public String getName() {
        return Username;
    }

    public void setName(String name) {
        this.Username = name;
    }

    public int getAge() {
        return Userage;
    }

    public void setAge(int age) {
        this.Userage = age;
    }

    public String getCity() {
        return Usercity;
    }

    public void setCity(String city) {
        this.Usercity = city;
    }

    @Override
    public String toString() {
        return "UserVersionOne{" +
                "Username='" + Username + '\'' +
                ", Userage=" + Userage +
                ", Usercity='" + Usercity + '\'' +
                '}';
    }
}
