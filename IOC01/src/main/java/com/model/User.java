package com.model;

public class User {

    private String userName;
    private String gender;
    private int id;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                '}';
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
