package com.example.restfulservicestwo.RestfulServicesTwo.User;

public class UserVersionTwo {
    private String UserName;
    private int UserAge;
    private String UserCity;
    private String UserDesc;
    private String UserEducation;


    public UserVersionTwo(String userName, int userAge, String userCity, String userDesc, String userEducation) {
        UserName = userName;
        UserAge = userAge;
        UserCity = userCity;
        UserDesc = userDesc;
        UserEducation = userEducation;
    }

    public UserVersionTwo(){}

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getUserAge() {
        return UserAge;
    }

    public void setUserAge(int userAge) {
        UserAge = userAge;
    }

    public String getUserCity() {
        return UserCity;
    }

    public void setUserCity(String userCity) {
        UserCity = userCity;
    }

    public String getUserDesc() {
        return UserDesc;
    }

    public void setUserDesc(String userDesc) {
        UserDesc = userDesc;
    }

    public String getUserEducation() {
        return UserEducation;
    }

    public void setUserEducation(String userEducation) {
        UserEducation = userEducation;
    }

    @Override
    public String toString() {
        return "UserVersionTwo{" +
                "UserName='" + UserName + '\'' +
                ", UserAge=" + UserAge +
                ", UserCity='" + UserCity + '\'' +
                ", UserDesc='" + UserDesc + '\'' +
                ", UserEducation='" + UserEducation + '\'' +
                '}';
    }
}
