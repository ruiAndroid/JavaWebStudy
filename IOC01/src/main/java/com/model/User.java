package com.model;

import java.util.Date;

public class User {

    private String userName;
    private String gender;
    private int id;

    private Date birth;


    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", birth=" + birth +
                '}';
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
